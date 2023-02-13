package com.gestionplaning.gestionplaning.repository;

import com.gestionplaning.gestionplaning.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
