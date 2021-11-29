package com.balu.springboot.department.service;

import com.balu.springboot.department.entity.Department;
import com.balu.springboot.department.repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DepartmentService {

    @Autowired
    private DepartmentRepository departmentRepository;

    public Department saveDepartment(Department department) {
        System.out.println("In saveDepartment() of DepartmentService.");
        return departmentRepository.save(department);
    }

    public Department findDepartmentById(Long departmentId) {
        System.out.println("In saveDepartment() of DepartmentService.");
        return departmentRepository.findByDepartmentId(departmentId);
    }
}
