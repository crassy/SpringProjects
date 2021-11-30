package com.balu.springboot.userservice.controller;

import com.balu.springboot.userservice.VO.ResponseTemplateVO;
import com.balu.springboot.userservice.entity.User;
import com.balu.springboot.userservice.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/")
    public User saveUser(@RequestBody User user){
        System.out.println("In saveUser() of UserController.");
        return userService.saveUser(user);
    }

    @GetMapping("/{id}")
    public ResponseTemplateVO getUserWithDepartment(@PathVariable("id") Long userId){
        System.out.println("In getUserWithDepartment() of UserController.");
        return userService.getUserWithDepartment(userId);
    }
}
