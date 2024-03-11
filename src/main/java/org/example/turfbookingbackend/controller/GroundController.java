package org.example.turfbookingbackend.controller;

import org.example.turfbookingbackend.model.Ground;
import org.example.turfbookingbackend.service.GroundService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("api/ground/")
@CrossOrigin(origins = "http://localhost:5173")
public class GroundController {

     GroundService groundService;

     @Autowired
    public GroundController(GroundService groundService) {
        this.groundService = groundService;
    }
    @GetMapping("/{name}")
    Ground geGround(@PathVariable String name)
    {
        return groundService.getGround(name);
    }
    @GetMapping("/add")
    Ground addGround(@RequestBody Ground ground){
         return groundService.addGround(ground);
    }
}
