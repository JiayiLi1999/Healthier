package com.sufer.controller;

import com.sufer.pojo.Patient;
import com.sufer.pojo.User;
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

        Collection<Patient> patients = patientService.selectPatientByDoctorId(Integer.parseInt(doctorId));

        model.addAttribute("patients",patients);

        return "search_personalInfo";
    }



}
