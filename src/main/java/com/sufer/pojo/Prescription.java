package com.sufer.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * Prescription实体bean
 * @author danger
 * @date 2020/6/8
 */
@Data
@AllArgsConstructor
@NoArgsConstructor

public class Prescription {

    private Integer prescriptionId;
    private Patient patient;
    private Doctor doctor;
    private Date prescriptionDate;
    private Medicine medicine;
    private Integer medicineNum;
    private String medicineFrequency;
    private Integer medicineDay;
    private Double medicineTotalPrice;
    private String comment;

    @Override
    public String toString() {
        return "Prescription{" +
                "prescriptionId=" + prescriptionId +
                ", patient=" + patient +
                ", doctor=" + doctor +
                ", prescriptionDate=" + prescriptionDate +
                ", medicine=" + medicine +
                ", medicineNum=" + medicineNum +
                ", medicineFrequency='" + medicineFrequency + '\'' +
                ", medicineDay=" + medicineDay +
                ", medicineTotalPrice=" + medicineTotalPrice +
                ", comment='" + comment + '\'' +
                '}';
    }
}
