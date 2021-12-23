package com.nclinic.Pedsotc.controllers;


import com.nclinic.Pedsotc.models.Appointment;
import com.nclinic.Pedsotc.services.AppointmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.nio.file.Path;
import java.util.List;

@RestController
@RequestMapping(value = "/poc/apt")
public class AppointmentController {

    @Autowired
    AppointmentService appointmentService;

    @RequestMapping(value = "/get",method = RequestMethod.GET)
    public List<Appointment> getAptData(){
        return appointmentService.getAptData();
    }

    @RequestMapping(path = "/take", consumes = "application/json", produces = "application/json")
    @ResponseStatus(HttpStatus.OK)
    public String takeAppointment(@RequestBody Appointment appointment){
        return appointmentService.takeAppointment(appointment);
    }

}
