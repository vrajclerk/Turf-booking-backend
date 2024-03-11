package org.example.turfbookingbackend.service;

import org.example.turfbookingbackend.Repository.GroundRepository;
import org.example.turfbookingbackend.model.Ground;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GroundServiceimpl implements GroundService {

    GroundRepository groundRepository;

    @Autowired
    public GroundServiceimpl(GroundRepository groundRepository) {
        this.groundRepository=groundRepository;
    }

    @Override
    public Ground getGround(String name) {
        return null;
    }

    public Ground addGround(Ground ground){
        groundRepository.save(ground);
        return ground;
    }
}
