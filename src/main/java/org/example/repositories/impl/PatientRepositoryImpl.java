package org.example.repositories.impl;

import org.example.models.Patient;
import org.example.repositories.PatientRepository;

import java.util.List;

public class PatientRepositoryImpl implements PatientRepository {
    @Override
    public void savePatient(Patient patient) {

    }

    @Override
    public Patient findByIdPatient(Long id) {
        return null;
    }

    @Override
    public List<Patient> getAllPatients() {
        return null;
    }

    @Override
    public void deleteByIdPatient(Long id) {

    }

    @Override
    public void updatePatient(Long id, Patient patient) {

    }
}
