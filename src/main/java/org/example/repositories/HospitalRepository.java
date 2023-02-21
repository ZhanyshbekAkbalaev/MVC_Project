package org.example.repositories;

import org.example.models.Doctor;
import org.example.models.Hospital;

import java.util.List;

public interface HospitalRepository {
    List<Hospital> getAllHospitals();

    void saveHospital(Hospital hospital);
    void deleteByIdHospital(Long id);
    void updateHospital(Long id, Hospital hospital);
    Hospital getHospitalById(Long id);
}
