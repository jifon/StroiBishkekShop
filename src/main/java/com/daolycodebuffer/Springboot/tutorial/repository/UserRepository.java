package com.daolycodebuffer.Springboot.tutorial.repository;

import com.daolycodebuffer.Springboot.tutorial.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

    User findByEmail(String email);
}
