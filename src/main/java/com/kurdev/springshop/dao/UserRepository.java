package com.kurdev.springshop.dao;

import com.kurdev.springshop.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository <User, Long>{
    User findFirstByName(String name);
}
