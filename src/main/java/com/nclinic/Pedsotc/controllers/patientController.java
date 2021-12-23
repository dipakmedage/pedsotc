package com.nclinic.Pedsotc.controllers;

import com.nclinic.Pedsotc.models.Patient;
import com.nclinic.Pedsotc.repositories.PatientRepository;
import com.nclinic.Pedsotc.services.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/poc/pat")
public class patientController {

    @Autowired
    private PatientService patientService;

    @Autowired
    private PatientRepository patientRepository;

    @RequestMapping(value = "/name", method = RequestMethod.GET)
    public List<Patient> getPatient() {
        return patientService.getpatient();

    }

    @RequestMapping(path = "/register", consumes = "application/json", produces = "application/json")
    @ResponseStatus(HttpStatus.OK)
    public String regPatient(@RequestBody Patient patient) {
        return patientService.regPatient(patient);
    }
}
