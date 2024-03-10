package org.example.turfbookingbackend.service;

import org.example.turfbookingbackend.Repository.BookingRepository;
import org.example.turfbookingbackend.Repository.GroundRepository;
import org.example.turfbookingbackend.Repository.UserRepository;
import org.example.turfbookingbackend.model.Booking;
import org.example.turfbookingbackend.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookingServiceImpl implements BookingService {
    private BookingRepository bookingRepository;
    private UserRepository userRepository;
    //private ServiceProviderRepository serviceProviderRepository;
    private GroundRepository groundRepository;
    @Autowired
    public BookingServiceImpl(BookingRepository bookingRepository, UserRepository userRepository,  GroundRepository groundRepository) {
        this.bookingRepository = bookingRepository;
        this.userRepository = userRepository;
        //this.serviceProviderRepository = serviceProviderRepository;
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
        //ServiceProvider serviceProvider = serviceProviderRepository.findById(Booking.getServiceProvider().getId());
        booking.setUser(user);
        booking.setGround(ground);
        //Booking.setServiceProvider(serviceProvider);
        bookingRepository.save(booking);
        return booking;
    }

    @Override
    public List<Booking> findAllByUserId(int id) {
        return bookingRepository.findAllByUserId(id);
    }
//    @Override
//    public List<Booking> findAllByServiceProviderId(int id) {
//        return BookingRepository.findAllByServiceProviderId(id);
//    }

    @Override
    public Booking updateBooking(int id, Booking Booking) {
        Booking b = BookingRepository.findById(id);
        b.setStatus(booking.getStatus());
        Booking data = BookingRepository.save(b);
        return data;
    }
}
}
