package org.example.turfbookingbackend.service;

import org.example.turfbookingbackend.Repository.AdminRepository;
import org.example.turfbookingbackend.Repository.GroundRepository;
import org.example.turfbookingbackend.model.Admin;
import org.example.turfbookingbackend.model.Ground;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static java.lang.Boolean.FALSE;
import static java.lang.Boolean.TRUE;

@Service
public class AdminServiceImpl implements  AdminService{

    AdminRepository adminRepository;

    GroundRepository serviceRepository;
    @Autowired
    public AdminServiceImpl(AdminRepository adminRepository, GroundRepository serviceRepository) {
        this.adminRepository = adminRepository;
        this.serviceRepository = serviceRepository;
    }

    @Override
    public List<Admin> findAll() {
        return adminRepository.findAll();
    }

    @Override
    public Admin addUser(Admin admin) {
        adminRepository.save(admin);
        return admin;
    }

    @Override
    public ResponseEntity verifyAdmin(Admin admin) {
        Admin check = adminRepository.findByEmail(admin.getEmail());
        if(check == null)
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("User is not found");

        if(check.getPassword().equals(admin.getPassword()))
            return ResponseEntity.ok(check);
        else
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Credential is not matched");
    }

    @Override
    public boolean checkAdmin(String email) {
        Admin admin = adminRepository.findByEmail(email);
        if(admin == null)
        {
            return FALSE;
        }
        return TRUE;
    }

    @Override
    public Admin getAdmin(int id) {
        return adminRepository.findById(id);
    }
}
