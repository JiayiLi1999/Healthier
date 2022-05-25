package com.sufer.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Patient实体bean
 * @author danger
 * @date 2020/6/8
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Patient {
    private int patientId;
    private String firstName;
    private String lastName;
    private int doctorId;
    private String gender;
    private int age;
    private String contact;
    private String SSN;
    private String address;
    private String addressCity;
    private String addressState;
    private String addressCountry;
    private String addressCode;
    private String relatedName;
    private String relatedPhoneNumber;
    private double height;
    private int weight;



}
