package com.infosys.cloudmonitoring.repository;

import com.infosys.cloudmonitoring.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByUsername(String username);
}