package com.sufer.controller;

import com.sufer.mapper.UserMapper;
import com.sufer.pojo.Doctor;
import com.sufer.pojo.User;
import com.sufer.service.DoctorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

import com.sufer.pojo.Doctor;
/**
 * @author danger
 * @date 2020/6/1 - 14:30
 */
@Controller
public class DoctorController {
    @Autowired
    private DoctorService doctorService;
    @Autowired
    private UserMapper userMapper;

    @RequestMapping("/newInfo")
    public String newInfo(@RequestParam("first_name")String firstName,
                            @RequestParam("last_name")String lastName,
                            @RequestParam("gender")String gender,
                            @RequestParam("birth_year")Integer birthYear,
                            @RequestParam("birth_month")Integer birthMonth,
                            @RequestParam("birth_date")Integer birthDate,
                            @RequestParam("education_level")Integer educationLevel,
                            @RequestParam("grading")Double grading,
                            @RequestParam("address")String address,
                            @RequestParam("address_city")String addressCity,
                            @RequestParam("address_state")String addressState,
                            @RequestParam("address_country")String addressCountry,
                            @RequestParam("address_code")String addressCode,
                            @RequestParam("phone_number")String phoneNumber,
                            @RequestParam("email")String email,
                            @RequestParam("position")String position,
                            @RequestParam("web_page")String webPage,
                            @RequestParam("introduction")String introduction,
                            HttpSession session,
                            Model model, HttpServletResponse response) throws IOException {
        Integer userid = (Integer) session.getAttribute("userid");
        User user = userMapper.selectUserById(userid);

        Doctor doctor = new Doctor(-1,firstName,lastName,gender,birthYear,birthMonth,birthDate,educationLevel,grading,address,
                addressCity,addressState,addressCountry,addressCode,phoneNumber,email,position,webPage,introduction);
        int d = doctorService.addDoctor(doctor);
        return "redirect:/page-login";
    }
}
