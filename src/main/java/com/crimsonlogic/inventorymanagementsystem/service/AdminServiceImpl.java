package com.crimsonlogic.inventorymanagementsystem.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crimsonlogic.inventorymanagementsystem.entity.Admin;
import com.crimsonlogic.inventorymanagementsystem.exception.AdminNotFoundException;
import com.crimsonlogic.inventorymanagementsystem.repository.IAdminRepository;

import java.util.List;

@Service
public class AdminServiceImpl implements IAdminService{
	
	@Autowired
	
	private IAdminRepository adminRepo;

	@Override
	public List<Admin> viewAllAdmin() {
		return adminRepo.findAll();
	}

	@Override
	public Admin viewAdminById(int admintId) throws AdminNotFoundException {
		return adminRepo.findById(adminId).get();
	}

	@Override
	public List<Admin> viewAllAdmintByName(String AdminName) {
		return adminRepo.findAdminByAdminName(adminName);;
	}

	@Override
	public Admin insertAdmin(Admin admin) {
		// TODO Auto-generated method stub
		return admin.save(Admin);
	}

	@Override
	public Admin insertStudent(Admin admin) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	

}
