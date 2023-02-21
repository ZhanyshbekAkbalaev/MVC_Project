package org.example.services;

import org.example.models.Hospital;

import java.util.List;

public interface HospitalService {
    List<Hospital> getAllHospitals();

    void saveHospital(Hospital hospital);
    void deleteByIdHospital(Long id);
    void updateHospital(Long id, Hospital hospital);
    Hospital getByIdHospital(Long id);
}
