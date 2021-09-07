package com.tutorial.springtutorial.Model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class Doctor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String doctorName;
    private String doctorSurname;
    private String doctorSpecialization;
//    private String doctorCode;

    @OneToMany (
//            mappedBy = "doctor",
            cascade = CascadeType.ALL,
            orphanRemoval = true
    )
    @JoinColumn (name = "doctor_id")
    private List<Employee> employees;

    @OneToMany (
//            mappedBy = "doctor",
            cascade = CascadeType.ALL,
            orphanRemoval = true
    )
    @JoinColumn (name = "doctor_id")
    private List<WeekTable> weekTables;


//  Nebereikainga ------------------------------------
//    @OneToOne
//    @JoinColumn(name = "patient_id")
//    private Patient patient;

//    @OneToOne
//    @JoinColumn(name = "registration_id",referencedColumnName = "id")
//    private Registration registration;

}
