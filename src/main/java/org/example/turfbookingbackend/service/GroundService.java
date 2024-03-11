package org.example.turfbookingbackend.service;

import org.example.turfbookingbackend.model.Ground;


public interface GroundService {

    public Ground getGround(String name);

    public Ground addGround(Ground ground);

}
