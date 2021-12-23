package com.nclinic.Pedsotc.repositories;

import com.nclinic.Pedsotc.models.Patient;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface PatientRepository extends CrudRepository<Patient, Long> {

    List<Patient> findByPatientName(String patientName);

}
