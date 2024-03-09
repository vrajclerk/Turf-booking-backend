package org.example.turfbookingbackend.controller;

import org.example.turfbookingbackend.service.GroundService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/ground/")
@CrossOrigin(origins = "http://localhost:5173")
public class GroundController {

    @Autowired
    private GroundService groundService;
}
