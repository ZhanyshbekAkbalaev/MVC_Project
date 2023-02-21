package org.example.repositories;

import org.example.models.Doctor;
import org.example.models.Patient;

import java.util.List;

public interface PatientRepository {
    void savePatient(Patient patient);
    Patient findByIdPatient(Long id);
    List<Patient> getAllPatients();
    void deleteByIdPatient(Long id);
    void updatePatient(Long id, Patient patient);
}
