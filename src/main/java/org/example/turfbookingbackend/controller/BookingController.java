package org.example.turfbookingbackend.controller;

import org.example.turfbookingbackend.service.BookingService;
import org.example.turfbookingbackend.service.GroundService;
import org.example.turfbookingbackend.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/book/ground/")
@CrossOrigin(origins = "http://localhost:5173")
public class BookingController {

    @Autowired
    private BookingService bookingService;

    @Autowired
    private UserService userService;

    @Autowired
    private GroundService groundService;

}
