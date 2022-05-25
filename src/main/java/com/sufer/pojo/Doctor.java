package com.sufer.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Date;

/**
 * Doctor实体bean
 * @author danger
 * @date 2020/6/8
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Doctor {
    private int doctorId;
    private String lastName;
    private String firstName;
    private String gender;
    private int birthYear;
    private int birthMonth;
    private int birthDate;
    private int educationLevel;
    private double grading;
    private String address;
    private String addressCity;
    private String addressState;
    private String addressCountry;
    private String addressCode;
    private String phoneNumber;
    private String email;
    private String position;
    private String webPage;
    private String introduction;
}
