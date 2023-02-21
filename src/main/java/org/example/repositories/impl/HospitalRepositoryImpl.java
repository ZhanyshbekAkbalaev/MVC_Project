package org.example.repositories.impl;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import org.example.models.Hospital;
import org.example.repositories.HospitalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Transactional
public class HospitalRepositoryImpl implements HospitalRepository {
    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<Hospital> getAllHospitals() {
        return entityManager.createQuery("select h from Hospital h", Hospital.class).getResultList();
    }

    @Override
    public void saveHospital(Hospital hospital) {
        entityManager.merge(hospital);
    }

    @Override
    public void deleteByIdHospital(Long id) {
        Hospital hos = entityManager.createQuery("select h from Hospital h where h.id=:id", Hospital.class).setParameter("id", id).getSingleResult();
        entityManager.remove(hos);
    }

    @Override
    public void updateHospital(Long id, Hospital hospital) {
        Hospital hos = entityManager.createQuery("from Hospital h where h.id=:id", Hospital.class).setParameter("id", id).getSingleResult();
        hos.setName(hospital.getName());
        hos.setAddress(hospital.getAddress());
    }

    @Override
    public Hospital getHospitalById(Long id) {
        return entityManager.createQuery("from Hospital h where h.id= :id",Hospital.class).setParameter("id",id).getSingleResult();
    }

}
