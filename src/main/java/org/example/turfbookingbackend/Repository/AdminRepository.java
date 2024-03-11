package org.example.turfbookingbackend.Repository;

import org.example.turfbookingbackend.model.Admin;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface AdminRepository extends JpaRepository<Admin,Integer> {

    @Query("select admin from Admin admin where admin.email = :email")
    Admin findByEmail(String email);
    @Query("select admin from Admin admin where admin.id = :id")
    public Admin findById(int id);
}
