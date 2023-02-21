package org.example.services;

import org.example.models.Department;

import java.util.List;

public interface DepartmentService {
    void saveDepartment(Long hospitalId,Department department);
    List<Department> getAllDepartments(Long hospitalId);
    Department findByIdDepartment(Long id);
    void deleteByIdDepartment(Long id);
    void updateDepartment(Long id, Department department);
}
