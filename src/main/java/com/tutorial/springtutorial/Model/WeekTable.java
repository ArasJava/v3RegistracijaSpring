package com.tutorial.springtutorial.Model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.annotations.LazyToOne;

import javax.persistence.*;
import java.io.Serializable;


@Entity
@Setter
@Getter
@ToString
@NoArgsConstructor
public class WeekTable implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false, updatable = false)
    private Long id;
    private Boolean monday;
    private Boolean tuesday;
    private Boolean wednesday;
    private Boolean thursday;
    private Boolean friday;
    private Long timeStart;
    private Long timeStop;
    private Long weekOfYear;
    private Long year;
    private Long doctorID;


}
