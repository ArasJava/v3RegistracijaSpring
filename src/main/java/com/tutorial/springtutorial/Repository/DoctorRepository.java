package com.tutorial.springtutorial.Repository;

import com.tutorial.springtutorial.Model.Doctor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface DoctorRepository extends JpaRepository<Doctor, Long> {

    void deleteDoctorById(Long id);

    Optional<Doctor> findDoctorById(Long id);

}
