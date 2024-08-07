package com.example.piggytech.Repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.piggytech.Model.Role;

public interface RoleRepository extends JpaRepository<Role, Long> {

    Optional<Role> findByName (String name); 

}