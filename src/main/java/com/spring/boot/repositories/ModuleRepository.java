package com.spring.boot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.spring.boot.entities.Module;

@Repository
public interface ModuleRepository extends JpaRepository<Module, Long> {

}