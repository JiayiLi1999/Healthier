package com.sufer.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * Record实体bean
 * @author danger
 * @date 2020/6/8
 */

@Data
@AllArgsConstructor
@NoArgsConstructor

public class Record {

    private Integer recordId;
    private Patient patient;
    private Doctor doctor;
    private Double bodyTemperature;
    private Integer breath;
    private Integer pulse;
    private Integer bloodPressureHigh;
    private Integer bloodPressureLow;
    private Integer bloodGlucose;
    private Integer bloodFat;
    private String diseasesClassification;
    private String symptom;
    private Date onset;
    private boolean isInfectious;
    private String chiefComplaint;
    private String presentIllness;
    private String pastIllness;
    private String personalIllness;
    private String familyIllness;
    private String diagnose;
    private String doctorAdvice;

    @Override
    public String toString() {
        return "Record{" +
                "recordId=" + recordId +
                ", patient=" + patient +
                ", doctor=" + doctor +
                ", bodyTemperature=" + bodyTemperature +
                ", breath=" + breath +
                ", pulse=" + pulse +
                ", bloodPressureHigh=" + bloodPressureHigh +
                ", bloodPressureLow=" + bloodPressureLow +
                ", bloodGlucose=" + bloodGlucose +
                ", bloodFat=" + bloodFat +
                ", diseasesClassification='" + diseasesClassification + '\'' +
                ", symptom='" + symptom + '\'' +
                ", onset=" + onset +
                ", isInfectious=" + isInfectious +
                ", chiefComplaint='" + chiefComplaint + '\'' +
                ", presentIllness='" + presentIllness + '\'' +
                ", pastIllness='" + pastIllness + '\'' +
                ", personalIllness='" + personalIllness + '\'' +
                ", familyIllness='" + familyIllness + '\'' +
                ", diagnose='" + diagnose + '\'' +
                ", doctorAdvice='" + doctorAdvice + '\'' +
                '}';
    }
}
