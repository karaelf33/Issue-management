package com.temelt.issuemanagment.repository;

import com.temelt.issuemanagment.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    User findAllByUsername(String username);
}
