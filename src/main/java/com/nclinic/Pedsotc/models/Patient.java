package com.nclinic.Pedsotc.models;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.CreationTimestamp;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.Data;

@Entity
@Data
@Table(name = Patient.TABLE_PATIENT)
public class Patient {

    public static final String TABLE_PATIENT = "patient_details";

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="patient_name")
    private String patientName;

    @Column(name = "date_of_birth")
    private Date dateOfBirth;

    @Column(name = "parent_name")
    private String parentName;

    @Column(name = "contact_number")
    private String contactNumber;

    @CreationTimestamp
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "created_at")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss")
    private Date createdAt;


    @Column(name = "modified_at")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss")
    private Date modifiedAt;

    @Column(name = "is_active")
    private Character isActive;

}
