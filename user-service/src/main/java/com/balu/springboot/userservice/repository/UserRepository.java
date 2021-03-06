package com.balu.springboot.userservice.repository;

import com.balu.springboot.userservice.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
//    User saveUser(User user);

    User findByUserId(Long userId);
}
