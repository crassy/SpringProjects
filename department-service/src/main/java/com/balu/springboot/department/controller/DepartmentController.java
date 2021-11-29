package com.balu.springboot.department.controller;

import com.balu.springboot.department.entity.Department;
import com.balu.springboot.department.service.DepartmentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/departments")
@Slf4j
public class DepartmentController {

    @Autowired
    private DepartmentService departmentService;


    @PostMapping(value = "/", produces = MediaType.APPLICATION_JSON_VALUE)
    public Department saveDepartment(@RequestBody Department department){
        System.out.println("Inside saveDepartment() method of DepartmentController");
        return departmentService.saveDepartment(department);
    }

    @GetMapping("/{id}")
    public Department findDepartmentById(@PathVariable("id") Long departmentId){
        System.out.println("Inside findDepartmentById() method of DepartmentController");
        return departmentService.findDepartmentById(departmentId);
    }
}
