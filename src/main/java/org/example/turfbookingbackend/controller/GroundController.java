package org.example.turfbookingbackend.controller;

import org.example.turfbookingbackend.service.GroundService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.BookingMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@BookingMapping("api/ground/")
@CrossOrigin(origins = "http://localhost:5173")
public class GroundController {

    @Autowired
    private GroundService groundService;
}
