package com.java.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.java.Entity.User;

public interface UserRepository extends JpaRepository<User, Long> {
}
