package org.example.turfbookingbackend.service;

import org.example.turfbookingbackend.Repository.AdminRepository;
import org.example.turfbookingbackend.Repository.BookingRepository;
import org.example.turfbookingbackend.Repository.GroundRepository;
import org.example.turfbookingbackend.Repository.UserRepository;
import org.example.turfbookingbackend.model.Admin;
import org.example.turfbookingbackend.model.Booking;
import org.example.turfbookingbackend.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookingServiceImpl implements BookingService {
    private BookingRepository bookingRepository;
    private UserRepository userRepository;
    private AdminRepository adminRepository;
    private GroundRepository groundRepository;
    @Autowired
    public BookingServiceImpl(BookingRepository bookingRepository, UserRepository userRepository,AdminRepository adminRepository,  GroundRepository groundRepository) {
        this.bookingRepository = bookingRepository;
        this.userRepository = userRepository;
        this.adminRepository = adminRepository;
        this.groundRepository = groundRepository;
    }

    @Override
    public List<Booking> findAll() {
        return bookingRepository.findAll();
    }

    @Override
    public Booking createBooking(Booking booking) {
        User user = userRepository.findById(booking.getUser().getId());
        org.example.turfbookingbackend.model.Ground ground = groundRepository.findById(booking.getGround().getId());
        Admin admin = adminRepository.findById(booking.getAdmin().getId());
        booking.setUser(user);
        booking.setGround(ground);
        booking.setAdmin(admin);
        bookingRepository.save(booking);
        return booking;
    }

    @Override
    public List<Booking> findAllByUserId(int id) {
        return bookingRepository.findAllByUserId(id);
    }


    @Override
    public List<Booking> findAllByAdminId(int id) {
        return bookingRepository.findAllByAdminId(id);
    }

    @Override
    public Booking updateBooking(int id, Booking booking) {
        Booking b = bookingRepository.findById(id);
        b.setStatus(booking.getStatus());
        Booking data = bookingRepository.save(b);
        return data;
    }
}

