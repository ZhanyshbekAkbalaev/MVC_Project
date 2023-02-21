package org.example.services.impl;

import org.example.models.Department;
import org.example.repositories.DepartmentRepository;
import org.example.services.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class DepartmentServiceImpl implements DepartmentService {
    @Autowired
    private DepartmentRepository repository;

    @Override
    public List<Department> getAllDepartments(Long hospitalId) {
        return repository.getAllDepartments(hospitalId);
    }

    @Override
    public void saveDepartment(Long hospitalId,Department department) {
        repository.saveDepartment(hospitalId,department);
    }

    @Override
    public Department findByIdDepartment(Long id) {
        return repository.findByIdDepartment(id);
    }

    @Override
    public void deleteByIdDepartment(Long id) {
        repository.deleteByIdDepartment(id);
    }

    @Override
    public void updateDepartment(Long id, Department department) {
        repository.updateDepartment(id,department);
    }


}
