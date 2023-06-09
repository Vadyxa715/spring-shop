package com.kurdev.springshop.service;

import com.kurdev.springshop.dto.UserDTO;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface UserService extends UserDetailsService { //security
    boolean save(UserDTO userDTO);
}
