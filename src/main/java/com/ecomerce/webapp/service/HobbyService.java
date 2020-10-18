package com.ecomerce.webapp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecomerce.webapp.entity.HobbyEntity;
import com.ecomerce.webapp.repository.HobbyRepository;

@Service
public class HobbyService {
	
	@Autowired
	HobbyRepository hobbyRepository;
	
	public String findHobbyById(int personId) {
		return hobbyRepository.findHobbyByPersonId(personId);
	}
	
	public void addHobby(HobbyEntity he) {
		hobbyRepository.save(he);
	}
}
