package org.example.services;

import org.example.models.Doctor;

import java.util.List;

public interface DoctorService {
    void saveDoctor(Doctor doctor);
    Doctor findByIdDoctor(Long id);
    List<Doctor> getAllDoctor();
    void deleteByIdDoctor(Long id);
    void updateDoctor(Long id, Doctor doctor);
}
