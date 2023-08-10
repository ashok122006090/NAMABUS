package springboot.namabus.controller;

 

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import springboot.namabus.dao.BookingRepo;
import springboot.namabus.entities.Booking;
import springboot.namabus.entities.Payment;
import springboot.namabus.service.BookingService;

 


 

@RestController
public class BookingController {
    @Autowired
    BookingService bookingService;
    @Autowired
    BookingRepo dto;

 

    public BookingService getBookingService() {
        return bookingService;
    }

 

    public void setBookingService(BookingService bookingService) {
        this.bookingService = bookingService;
    }

 

    @PostMapping("/addBookings/{bookingId}")

 

    public Booking addPaymentToBooking(@PathVariable int bookingId, @RequestBody Payment payment) {

 

        Booking booking = bookingService.addPaymentToBooking(bookingId, payment);
        return booking;
    }

 

    @PostMapping("/Booking")
    public Booking createBooking(@RequestBody Booking booking) {
        return bookingService.createBooking(booking);
    }

 

}