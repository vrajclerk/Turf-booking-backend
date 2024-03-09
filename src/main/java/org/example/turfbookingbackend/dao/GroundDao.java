package org.example.turfbookingbackend.dao;

import org.example.turfbookingbackend.model.Ground;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface GroundDao extends JpaRepository<Ground,Integer> {
    List<Ground> findByStatus(int status);
}
