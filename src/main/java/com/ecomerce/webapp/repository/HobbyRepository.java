package com.ecomerce.webapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.ecomerce.webapp.entity.HobbyEntity;

@Repository
public interface HobbyRepository extends JpaRepository<HobbyEntity, Integer>{
	
	@Query("SELECT h.name FROM HobbyEntity h where h.personId=:personId")	
	public String findHobbyByPersonId(@Param("personId")Integer personId);
}
