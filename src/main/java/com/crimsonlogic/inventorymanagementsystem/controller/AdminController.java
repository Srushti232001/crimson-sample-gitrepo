package com.crimsonlogic.inventorymanagementsystem.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.crimsonlogic.inventorymanagementsystem.entity.Admin;
import com.crimsonlogic.inventorymanagementsystem.service.IAdminService;

@RestController
public class AdminController {
	
	@Autowired
	private IAdminService addService;
	

@GetMapping("/viewAllAdmin")

public List<Admin>viewAllAdmin(){

	return addService.viewAllAdmin();
	

@PostMapping("/insertAdmin")

public Admin insertAdmin(@RequestBody Admin admin) {

	return addService.insertAdmin(admin);

}
