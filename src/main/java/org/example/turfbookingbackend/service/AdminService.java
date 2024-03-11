package org.example.turfbookingbackend.service;

import org.example.turfbookingbackend.model.Admin;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface AdminService {

    public List<Admin> findAll();

    public Admin addUser(Admin admin);
    public ResponseEntity verifyAdmin(Admin admin);

    public boolean checkAdmin(String email);

    public Admin getAdmin(int id);



}
