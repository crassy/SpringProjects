package com.balu.springboot.department.controller;

import com.balu.springboot.department.entity.Department;
import com.balu.springboot.department.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/departments")
public class DepartmentController {

    @Autowired
    private DepartmentService departmentService;

    @PostMapping("/")
    public Department saveDepartment(@RequestBody Department department){
        System.out.println("In saveDepartment() of DepartmentController.");
        return departmentService.saveDepartment(department);
    }

    @GetMapping("/{id}")
    public Department findDepartmentById(@PathVariable("id") Long departmentId){
        System.out.println("In saveDepartment() of DepartmentController.");
        return departmentService.findDepartmentById(departmentId);
    }
}
