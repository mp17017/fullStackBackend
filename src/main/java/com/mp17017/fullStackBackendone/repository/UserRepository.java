package com.mp17017.fullStackBackendone.repository;

import com.mp17017.fullStackBackendone.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {

}
