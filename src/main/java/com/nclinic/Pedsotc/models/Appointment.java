package com.nclinic.Pedsotc.models;


import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.util.Date;

@Entity
@Data
@Table(name = Appointment.TABLE_APPOINTMENT)
public class Appointment {

    public static final String TABLE_APPOINTMENT="appointment_details";

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "appointment_id")
    private Long id;

    @Column(name = "patient_name")
    private String patientName;

    @Column(name = "appointment_date")
    private Date appointmentDate;

    @Column(name = "appointment_time")
    private String appointmentTime;

    @Column(name = "amountPaid")
    private int amountPaid;

    @Column(name = "amount_paid_on")
    private Date amountPaidOn;

    @Column(name = "remaining_amount")
    private int remainingAmount;

    @Column(name = "is_active")
    private Character isActive;

    @CreationTimestamp
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "created_at")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss")
    private Date createdAt;


    @Column(name = "modified_at")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss")
    private Date modifiedAt;


}
