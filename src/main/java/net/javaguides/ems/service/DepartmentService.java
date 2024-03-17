package net.javaguides.ems.service;

import net.javaguides.ems.dto.DepartmentDto;
import net.javaguides.ems.entity.Department;

import java.util.List;

public interface DepartmentService {
    DepartmentDto createDepartment(DepartmentDto departmentDto);

    DepartmentDto getDepartmentById(Long departmentId);

    List<DepartmentDto> getAllDepartments();

    DepartmentDto updateDepartment(Long departmentId, DepartmentDto updatedDepartmentDto);

    void deleteDepartment(Long departmentId);
}
