package org.example.turfbookingbackend.controller;

import org.example.turfbookingbackend.model.Booking;
import org.example.turfbookingbackend.service.BookingService;
import org.example.turfbookingbackend.service.GroundService;
import org.example.turfbookingbackend.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/book/ground/")
@CrossOrigin(origins = "http://localhost:5173")
public class BookingController {

    private BookingService bookingService;
    @Autowired
    public BookingController(BookingService bookingService) {
        this.bookingService = bookingService;
    }

    @GetMapping("/requests/user/{id}")
    List<Booking> findAllForUser(@PathVariable int id){
        return bookingService.findAllByUserId(id);
    }
    @GetMapping("/requests/serviceprovider/{id}")
    List<Booking> findAllForAdmin(@PathVariable int id){
        return bookingService.findAllByAdminId(id);
    }

    @PostMapping("/create")
    ResponseEntity createBooking(@RequestBody Booking booking)
    {
//        System.out.println(bindingResult.);
//        if(bindingResult.hasErrors())
//        {
//            Map<String, String> errors = new HashMap<>();
//            for (FieldError error : bindingResult.getFieldErrors()) {
//                errors.put(error.getField(), error.getDefaultMessage());
//            }
//            System.out.println(errors);
//            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(errors);
//        }
        Booking r = bookingService.createBooking(booking);
        return ResponseEntity.ok(r);
    }
    @PatchMapping("/update/{id}")
    Booking updateBooking(@PathVariable int id ,@RequestBody Booking booking)
    {
        return bookingService.updateBooking(id,booking);
    }


}
