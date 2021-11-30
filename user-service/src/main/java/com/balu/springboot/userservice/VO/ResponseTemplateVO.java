package com.balu.springboot.userservice.VO;

import com.balu.springboot.userservice.entity.User;
import lombok.Data;

@Data
public class ResponseTemplateVO {

    private User user;
    private Department department;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public ResponseTemplateVO(User user, Department department) {
        this.user = user;
        this.department = department;
    }

    public ResponseTemplateVO() {
    }
}
