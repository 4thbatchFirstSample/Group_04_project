package com.spring.boot.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.spring.boot.entities.SubModule;

@Repository
public interface SubModulerepository extends JpaRepository<SubModule, Long>{
	public List<SubModule> findByModuleId(Long id);
}
