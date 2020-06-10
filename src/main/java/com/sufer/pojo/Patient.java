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

    private Integer patientId;
    private String patientName;
    private boolean gender;
    private Integer age;
    private String contact;
    private String IDCardNo;
    private String addressCity;
    private String addressDistrict;
    private String addressStreet;
    private String relatedName;
    private String relatedPhoneNumber;
    private Double height;
    private Double weight;

    @Override
    public String toString() {
        return "Patient{" +
                "patientId=" + patientId +
                ", patientName='" + patientName + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", contact='" + contact + '\'' +
                ", IDCardNo='" + IDCardNo + '\'' +
                ", addressCity='" + addressCity + '\'' +
                ", addressDistrict='" + addressDistrict + '\'' +
                ", addressStreet='" + addressStreet + '\'' +
                ", relatedName='" + relatedName + '\'' +
                ", relatedPhoneNumber='" + relatedPhoneNumber + '\'' +
                ", height=" + height +
                ", weight=" + weight +
                '}';
    }
}
