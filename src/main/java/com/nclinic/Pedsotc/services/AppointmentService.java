package com.nclinic.Pedsotc.services;

import com.nclinic.Pedsotc.models.Appointment;
import com.nclinic.Pedsotc.repositories.AppointmentRepository;
import org.apache.catalina.LifecycleState;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AppointmentService {

    @Autowired
    AppointmentRepository appointmentRepository;

    public List<Appointment> getAptData(){
        return (List<Appointment>) appointmentRepository.findAll();
    }

    public String takeAppointment(Appointment appointment){
        appointmentRepository.save(appointment);
        return "ok";
    }
}
