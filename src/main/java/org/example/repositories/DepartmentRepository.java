package org.example.repositories;

import org.example.models.Appointment;
import org.example.models.Department;

import java.util.List;

public interface DepartmentRepository {
    void saveDepartment(Long hospitalId,Department department);
    Department findByIdDepartment(Long id);
    List<Department> getAllDepartments(Long hospitalId);
    void deleteByIdDepartment(Long id);
    void updateDepartment(Long id, Department department);
}
