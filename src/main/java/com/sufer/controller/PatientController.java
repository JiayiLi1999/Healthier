package com.sufer.controller;

import com.sufer.pojo.Patient;
import com.sufer.service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.Collection;
import java.util.List;

/**
 * PatientController
 * @author danger
 * @date 2020/6/1 - 14:30
 */
@Controller
public class PatientController {

    @Autowired
    private PatientService patientService;

    @RequestMapping("/selectPatient")
    public String selectPatient(HttpServletRequest request, Model model){

        String doctorId = request.getParameter("doctor-id");

        if (!doctorId.isEmpty()){
            Collection<Patient> patients = patientService.selectPatientByDoctorId(Integer.parseInt(doctorId));
            model.addAttribute("patients",patients);
        }


        return "search_personalInfo";
    }

    @RequestMapping("/newPatient")
    public String newPatient(@RequestParam("first_name")String firstName,
                             @RequestParam("last_name")String lastName,
                             @RequestParam("doctor_id")Integer doctorId,
                             @RequestParam("gender")String gender,
                             @RequestParam("age")Integer age,
                             @RequestParam("contact")String contact,
                             @RequestParam("SSN")String SSN,
                             @RequestParam("address")String address,
                             @RequestParam("address_city")String addressCity,
                             @RequestParam("address_state")String addressState,
                             @RequestParam("address_country")String addressCountry,
                             @RequestParam("address_code")String addressCode,
                             @RequestParam("related_name")String relatedName,
                             @RequestParam("related_phonenumber")String relatedPhoneNumber,
                             @RequestParam("height")Double height,
                             @RequestParam("weight")Integer weight,
                             HttpSession session,
                             Model model, HttpServletResponse response) throws IOException {
        System.out.println("running new_record");
        Patient patient = new Patient(0,firstName,lastName,doctorId,gender,age,contact,SSN,address,
                addressCity,addressState,addressCountry,addressCode,relatedName,relatedPhoneNumber,height,weight);
        System.out.println(patient);
        int p = patientService.addPatient(patient);
        System.out.println("p = " + p);
        model.addAttribute("msg","新建病例成功!");
        return "redirect:/new_patient";
    }



}
