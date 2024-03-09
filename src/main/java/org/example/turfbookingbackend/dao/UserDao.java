package org.example.turfbookingbackend.dao;

import org.example.turfbookingbackend.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserDao extends JpaRepository<User,Integer> {
    User findByEmailIdAndPassword(String emailId, String password);
    User findByEmailIdAndPasswordAndRole(String emailId, String password, String role);
    User findByEmailIdAndRole(String emailId, String role);
    User findByEmailId(String emailId);
    List<User> findByRole(String role);
}
