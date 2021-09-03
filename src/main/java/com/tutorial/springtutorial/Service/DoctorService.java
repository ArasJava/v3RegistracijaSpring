package com.tutorial.springtutorial.Service;
import com.tutorial.springtutorial.Exceptions.ResourceNotFoundException;
import com.tutorial.springtutorial.Model.Doctor;
import com.tutorial.springtutorial.Repository.DoctorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DoctorService {
    private final DoctorRepository doctorRepository;

    @Autowired
    public DoctorService(DoctorRepository doctorRepository) {
        this.doctorRepository = doctorRepository;
    }

    public Doctor addDoctor(Doctor doctor) {
//        doctor.setDoctorCode(UUID.randomUUID().toString());
        return doctorRepository.save(doctor);
    }

    public List<Doctor> findAllDoctors() {
        return doctorRepository.findAll();
    }

    public Doctor updateDoctor(Doctor doctor){
        return doctorRepository.save(doctor);
    }

    public Doctor findDoctorByID(Long id) {
        return doctorRepository.findDoctorById(id)
                .orElseThrow(()-> new ResourceNotFoundException("Gydytojo su id " + id + " nerasta." ));
    }
    public void deleteDoctor(Long id) {
        doctorRepository.deleteDoctorById(id);
    }
}
