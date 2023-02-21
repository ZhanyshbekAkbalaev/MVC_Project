package org.example.repositories;

import org.example.models.Appointment;
import org.example.models.Doctor;

import java.util.List;

public interface DoctorRepository {
    void saveDoctor(Doctor doctor);
    Doctor findByIdDoctor(Long id);
    List<Doctor> getAllDoctor();
    void deleteByIdDoctor(Long id);
    void updateDoctor(Long id, Doctor doctor);
}
