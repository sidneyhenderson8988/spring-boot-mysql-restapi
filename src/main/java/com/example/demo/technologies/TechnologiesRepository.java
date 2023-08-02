package com.example.demo.technologies;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface TechnologiesRepository extends JpaRepository<Technologies, Integer>{

	@Query("SELECT t FROM Technologies t WHERE t.name= ?1")
	Technologies findByName(String name);
	
}
