package org.example.turfbookingbackend.Repository;

import org.example.turfbookingbackend.model.Ground;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;


import java.util.List;

public interface GroundRepository extends JpaRepository<Ground,Integer> {
    @Query("select ground from Ground ground where ground.name = :name")
    Ground findByName(String name);
    @Query("select ground from Ground ground where ground.id = :id")
    public Ground findById(int id);
}
