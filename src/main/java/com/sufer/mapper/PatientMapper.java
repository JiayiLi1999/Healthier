package com.sufer.mapper;

import com.sufer.pojo.Patient;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * PatientMapper
 * @author danger
 * @date 2020/6/1 - 13:36
 */
@Mapper
@Repository

public interface PatientMapper {
    int addPatient(Patient patient);
}
