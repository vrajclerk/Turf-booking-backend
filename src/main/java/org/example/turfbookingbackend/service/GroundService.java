package org.example.turfbookingbackend.service;

import org.example.turfbookingbackend.Repository.GroundRepository;
import org.example.turfbookingbackend.model.Ground;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GroundService {

    @Autowired
    private GroundRepository groundDao;
    public Ground addGround(Ground ground) {
        return groundDao.save(ground);
    }

    public Ground getGroundById(int groundId) {
        return groundDao.findById(groundId).get();
    }

    public List<Ground> getAllGroundByStatus(int status) {
        return this.groundDao.findByStatus(status);
    }

    public void deleteGround(Ground ground) {
        this.groundDao.delete(ground);
    }
}
