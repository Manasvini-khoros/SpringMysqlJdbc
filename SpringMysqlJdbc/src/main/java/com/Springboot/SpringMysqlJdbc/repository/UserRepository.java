package com.Springboot.SpringMysqlJdbc.repository;

import com.Springboot.SpringMysqlJdbc.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
}
