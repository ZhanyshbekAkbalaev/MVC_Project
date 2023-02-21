package org.example.services.impl;

import org.example.models.Hospital;
import org.example.repositories.HospitalRepository;
import org.example.services.HospitalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HospitalServiceImpl implements HospitalService {
    @Autowired
    private HospitalRepository hospitalRepository;

    @Override
    public List<Hospital> getAllHospitals() {
        return hospitalRepository.getAllHospitals();
    }

    @Override
    public void saveHospital(Hospital hospital) {
        hospitalRepository.saveHospital(hospital);
    }

    @Override
    public void deleteByIdHospital(Long id) {
        hospitalRepository.deleteByIdHospital(id);
    }

    @Override
    public void updateHospital(Long id, Hospital hospital) {
        hospitalRepository.updateHospital(id,hospital);
    }

    @Override
    public Hospital getByIdHospital(Long id) {
        return hospitalRepository.getHospitalById(id);
    }

}
