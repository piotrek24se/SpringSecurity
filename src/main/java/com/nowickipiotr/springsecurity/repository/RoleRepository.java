package com.nowickipiotr.springsecurity.repository;

import com.nowickipiotr.springsecurity.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role, Long> {
}
