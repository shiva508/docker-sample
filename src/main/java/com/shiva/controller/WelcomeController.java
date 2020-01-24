package com.shiva.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.shiva.model.Company;
@RestController
public class WelcomeController {
@GetMapping("/welcome")
	public Company welcomenotes() {
		return new Company("Prodigy Systems and Sevices","Venkat-Manjeera");
	}
}
