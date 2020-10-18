package com.ecomerce.webapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ecomerce.webapp.entity.HobbyEntity;
import com.ecomerce.webapp.service.HobbyService;

@RestController
@RequestMapping(path="/webapitwo")
public class HobbyController {
	
	@Autowired(required=true)
	HobbyService hobbyService;
	
	@GetMapping("/hobby/{personId}")
	public String findByPersonId(@PathVariable int personId) {
		return hobbyService.findHobbyById(personId);
	}
	
	@PostMapping("/hobby")
	public void addHobby(@RequestBody HobbyEntity he) {
		hobbyService.addHobby(he);
	}
}
