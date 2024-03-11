package org.example.turfbookingbackend.controller;

import org.example.turfbookingbackend.model.Admin;
import org.example.turfbookingbackend.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/user/")
@CrossOrigin(origins = "http://localhost:5173")
public class AdminController {

    AdminService adminService;
    @Autowired
    public AdminController(AdminService adminService) {
        this.adminService = adminService;
    }

    @GetMapping("/admin")
    List<Admin> findAll(){ return adminService.findAll();}

    @PostMapping(value = "/admin/register")
    public ResponseEntity addUser(@RequestBody Admin admin){
        admin = adminService.addUser(admin);
        return ResponseEntity.ok(admin);
    }
    @PostMapping(value = "/user/login")
    public ResponseEntity verifyUser(@RequestBody Admin admin){
        return adminService.verifyAdmin(admin);
    }
    @GetMapping("/{id}")
    public ResponseEntity getAdmin(@PathVariable int id)
    {
        Admin admin= adminService.getAdmin(id);
        return ResponseEntity.ok(admin);
    }
}
