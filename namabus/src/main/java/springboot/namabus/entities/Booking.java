package springboot.namabus.entities;

 

import java.math.BigDecimal;
import java.time.LocalDateTime;

 

import jakarta.persistence.CascadeType;

 

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

 

@Entity
@Table(name = "bookings")
public class Booking {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int bookingId;

 

    private LocalDateTime bookingDate;
    @OneToOne(mappedBy = "booking", cascade = CascadeType.ALL)
    private Payment payment;

 

    private int seatNumber;

 

    @Enumerated(EnumType.STRING)

 

    private BookingStatus Bookingstatus;

 

    @Enumerated(EnumType.STRING)

 

    private PaymentStatus PaymentStatus;

 

    public PaymentStatus getPaymentStatus() {
        return PaymentStatus;
    }

 

    public void setPaymentStatus(PaymentStatus paymentstatus) {
    PaymentStatus = paymentstatus;
    }

 

    private BigDecimal TotalAmount;

 

    public BigDecimal getTotalAmount() {
        return TotalAmount;
    }

 

    public void setTotalAmount(BigDecimal totalAmount) {
        TotalAmount = totalAmount;
    }

 

    public Booking() {
    }

 

    public Booking(int bookingId, LocalDateTime bookingDate, int seatNumber, BookingStatus bookingstatus) {
        super();
        this.bookingId = bookingId;
        this.bookingDate = bookingDate;
        this.seatNumber = seatNumber;
        this.Bookingstatus = bookingstatus;
    }

 

    public int getBookingId() {
        return bookingId;
    }

 

    public void setBookingId(int bookingId) {
        this.bookingId = bookingId;
    }

 

    public LocalDateTime getBookingDate() {
        return bookingDate;
    }

 

    public void setBookingDate(LocalDateTime bookingDate) {
        this.bookingDate = bookingDate;
    }

 

    public int getSeatNumber() {
        return seatNumber;
    }

 

    public void setSeatNumber(int seatNumber) {
        this.seatNumber = seatNumber;
    }

 

    public BookingStatus getBookingstatus() {
        return Bookingstatus;
    }

 

    public void setBookingstatus(BookingStatus bookingstatus) {
        Bookingstatus = bookingstatus;
    }

 

}