package com.spring.boot.repositories;
/**
 * @author Johnvesly Alanroy
 * @since 18th September 2020
 */
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.spring.boot.entities.Module;

@Repository
public interface ModuleRepository extends JpaRepository<Module, Long> {
 /**
  * Interface extends JpaRepository with parameter <Classname, PrimaryKeyDataType>
  */
}
