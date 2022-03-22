package com.daolycodebuffer.Springboot.tutorial.service;

import com.daolycodebuffer.Springboot.tutorial.model.User;
import com.daolycodebuffer.Springboot.tutorial.web.dto.UserRegistrationDto;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface UserService extends UserDetailsService {

    User save(UserRegistrationDto registrationDto);


}
