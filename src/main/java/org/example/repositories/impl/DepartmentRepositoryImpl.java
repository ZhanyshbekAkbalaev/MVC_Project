package org.example.repositories.impl;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import org.example.models.Department;
import org.example.models.Hospital;
import org.example.repositories.DepartmentRepository;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Transactional
public class DepartmentRepositoryImpl implements DepartmentRepository {
    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public void saveDepartment(Long hospitalId, Department department) {
        entityManager.persist(department);
        Hospital hospital = entityManager.find(Hospital.class, hospitalId);
        department.setHospital(hospital);


    }

    @Override
    public Department findByIdDepartment(Long id) {
        Department dep = entityManager.createQuery("from Department d where d.id = :id", Department.class).setParameter("id", id).getSingleResult();
        return dep;
    }

    @Override
    public List<Department> getAllDepartments(Long hospitalId) {
        return entityManager.createQuery("from Department d where d.hospital.id=:hospitalId"
                ,Department.class).setParameter("hospitalId", hospitalId).getResultList();
    }

    @Override
    public void deleteByIdDepartment(Long id) {
        Department dep = entityManager.createQuery("from Department d where d.id = :id", Department.class).setParameter("id", id).getSingleResult();
        entityManager.remove(dep);
    }

    @Override
    public void updateDepartment(Long id, Department department) {
        Department dep = entityManager.createQuery("from Department d where d.id = :id", Department.class).setParameter("id", id).getSingleResult();
        dep.setName(department.getName());
        dep.setHospital(department.getHospital());

    }
}
