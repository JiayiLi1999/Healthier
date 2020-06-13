package com.sufer.controller;

import com.sufer.pojo.Doctor;
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

    @RequestMapping("/newInfo")
    public String newInfo(@RequestParam("doctor_name")String doctorName,
                            @RequestParam("gender")String gender,
                            @RequestParam("birthday")String birthday,
                            @RequestParam("education")String education,
                            @RequestParam("mark")Double mark,
                            @RequestParam("address")String address,
                            @RequestParam("hospital_name")String hospitalName,
                            @RequestParam("phone_number")String phoneNumber,
                            @RequestParam("email")String email,
                            @RequestParam("position")String position,
                            @RequestParam("office")String office,
                            @RequestParam("web_page")String webPage,
                            @RequestParam("introduction")String introduction,
                            HttpSession session,
                            Model model, HttpServletResponse response) throws IOException {
        System.out.println("running_doctor");
        Doctor doctor = new Doctor(0,doctorName,gender,birthday,education,mark,address,hospitalName,phoneNumber,email,position,office,webPage,introduction);
        System.out.println(doctor);
        int d = doctorService.addDoctor(doctor);
        System.out.println("d = " + d);
        //session.setAttribute("msg","注册成功!");
//        model.addAttribute("msg","注册成功!");
        return "redirect:/index";
    }
}
