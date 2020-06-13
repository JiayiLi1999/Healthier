package com.sufer.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

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

    private Integer doctorId;
    private String doctorName;
    private String address;
    private Hospital hospital;
    private String position;
    private String introduction;
    private Double mark;
    private Date birthday;
    private boolean gender;
    private String education;
    private String phoneNumber;
    private String office;
    private String email;
    private String webpage;

    @Override
    public String toString() {
        return "Doctor{" +
                "doctorId=" + doctorId +
                ", doctorName='" + doctorName + '\'' +
                ", address='" + address + '\'' +
                ", hospital=" + hospital +
                ", position='" + position + '\'' +
                ", introduction='" + introduction + '\'' +
                ", mark=" + mark +
                ", birthday=" + birthday +
                ", gender=" + gender +
                ", education='" + education + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", office='" + office + '\'' +
                ", email='" + email + '\'' +
                ", webpage='" + webpage + '\'' +
                '}';
    }
}
