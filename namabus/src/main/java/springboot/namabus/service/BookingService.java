package springboot.namabus.service;

 

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import springboot.namabus.dao.BookingRepo;
import springboot.namabus.entities.Booking;
import springboot.namabus.entities.Payment;

 



 

@Service("bookingService")
public class BookingService {
    @Autowired
    BookingRepo dto;

 

    public BookingRepo getDto() {
        return dto;
    }

 

    public void setDto(BookingRepo dto) {
        this.dto = dto;
    }

 

    public Booking addPaymentToBooking(int bookingId, Payment payment) {
        Booking booking = dto.findById(bookingId).orElse(null);

 

        if (booking != null) {

 

            dto.save(booking);
        } else {

 

            return null;
        }
        return booking;
    }

 

    public Booking createBooking(Booking booking) {
        return dto.save(booking);
    }
}