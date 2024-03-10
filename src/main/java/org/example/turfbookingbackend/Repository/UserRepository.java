package org.example.turfbookingbackend.Repository;

import org.example.turfbookingbackend.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User,Integer> {
    @Query("select user from User user where user.email = :email")
    User findByEmail(String email);
    @Query("select user from User user where user.id = :id")
    User findById(int id);
}
