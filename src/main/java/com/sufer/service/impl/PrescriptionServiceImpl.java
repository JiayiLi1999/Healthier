package com.sufer.service.impl;

import com.sufer.mapper.PrescriptionMapper;
import com.sufer.pojo.Prescription;
import com.sufer.service.PrescriptionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author danger
 * @date 2020/6/1 - 14:14
 */

@Service("PrescriptionService")
public class PrescriptionServiceImpl implements PrescriptionService {
    @Autowired
    private PrescriptionMapper prescriptionMapper;

    @Override
    public int addPrescription(Prescription prescription) {
        return prescriptionMapper.addPrescription(prescription);
    }

}
