package com.example.demo.auth;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Repository
@Transactional(readOnly = true)
public interface EmployeeObject extends JpaRepository<Auth, Long> {

    Optional<Auth> findByEmail(String email);
}
