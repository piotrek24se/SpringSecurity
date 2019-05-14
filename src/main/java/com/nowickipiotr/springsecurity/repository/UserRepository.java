package com.nowickipiotr.springsecurity.repository;

import com.nowickipiotr.springsecurity.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
}
