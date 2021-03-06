package com.tutorial.springtutorial.Model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.io.Serializable;


@Entity
@Setter
@Getter
@ToString
@NoArgsConstructor
public class Employee implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false, updatable = false)
    private Long id;
    private Long doctor_id;
    private String date;
    private String time;
    private String purpose;
    private String name;
    private String surname;
    private String birthday;
    private String phone;
    private String message;
    @Column(nullable = false, updatable = false)
    private String employeeCode;

//    @ManyToOne
//    @JoinColumn(name = "id")
//    private Doctor doctor;

}
