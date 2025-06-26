package com.jspackers.backend.controller;

import com.jspackers.backend.model.Booking;
import com.jspackers.backend.service.BookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/bookings")
@CrossOrigin(origins = "http://localhost:3000")
public class BookingController {

    @Autowired
    private BookingService bookingService;

    @GetMapping("/test")
    public String testEndpoint() {
        return "Booking Controller is working!";
    }

    @PostMapping
    public Booking createBooking(@RequestBody Booking booking) {
        return bookingService.saveBooking(booking);
    }

    @GetMapping
    public List<Booking> getAllBookings() {
        return bookingService.getAllBookings();
    }

    @GetMapping("/{id}")
    public Booking getBookingById(@PathVariable Long id) {
        Optional<Booking> bookingOptional = bookingService.getBookingById(id);
        return bookingOptional.orElse(null);
    }

    @DeleteMapping("/{id}")
    public void deleteBooking(@PathVariable Long id) {
        bookingService.deleteBooking(id);
    }

    @PutMapping("/{id}")
    public Booking updateBooking(@PathVariable Long id, @RequestBody Booking updatedBooking) {
        Optional<Booking> existingBookingOptional = bookingService.getBookingById(id);
        if (existingBookingOptional.isPresent()) {
            Booking existingBooking = existingBookingOptional.get();

            // ✅ Update only with correct method names based on your Booking.java
            existingBooking.setCustomerName(updatedBooking.getCustomerName());
            existingBooking.setContactNumber(updatedBooking.getContactNumber()); // ✅ changed
            existingBooking.setPickupLocation(updatedBooking.getPickupLocation());
            existingBooking.setDropLocation(updatedBooking.getDropLocation());
            existingBooking.setMovingDate(updatedBooking.getMovingDate()); // ✅ changed

            return bookingService.saveBooking(existingBooking);
        } else {
            return null;
        }
    }
}
