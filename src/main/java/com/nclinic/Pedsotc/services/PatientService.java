package com.nclinic.Pedsotc.services;

import com.nclinic.Pedsotc.models.Patient;
import com.nclinic.Pedsotc.repositories.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PatientService {

    @Autowired
    private PatientRepository patientRepository;

    public List<Patient> getpatient(){
        return (List<Patient>) patientRepository.findAll();
    }
    public String regPatient(Patient patient){
        patientRepository.save(patient);
        return "ok";
    }
}
