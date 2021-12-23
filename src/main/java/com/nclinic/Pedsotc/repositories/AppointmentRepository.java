package com.nclinic.Pedsotc.repositories;

import com.nclinic.Pedsotc.models.Appointment;
import org.springframework.data.repository.CrudRepository;


public interface AppointmentRepository extends CrudRepository<Appointment,Long> {
}
