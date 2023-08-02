package springboot.namabus.entities;

import java.time.LocalDate;
import java.time.LocalTime;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name="payments")
	
	public class Payment {
		@Id
		
		private int paymentId;
		private String bookingId;
		private LocalDate paymentDate;
		private LocalTime paymentTime;
		private double total;
		
		private PaymentStatus status;
		private PaymentMethod method;
		
		public Payment() {
			super();
			
		}
		public Payment(int paymentId, String bookingId, LocalDate paymentDate, LocalTime paymentTime, double total,
				PaymentStatus status, PaymentMethod method) {
			super();
			this.paymentId = paymentId;
			this.bookingId = bookingId;
			this.paymentDate = paymentDate;
			this.paymentTime = paymentTime;
			this.total = total;
			this.status = status;
			this.method = method;
		}
		public int getPaymentId() {
			return paymentId;
		}
		public void setPaymentId(int paymentId) {
			this.paymentId = paymentId;
		}
		public String getBookingId() {
			return bookingId;
		}
		public void setBookingId(String bookingId) {
			this.bookingId = bookingId;
		}
		public LocalDate getPaymentDate() {
			return paymentDate;
		}
		public void setPaymentDate(LocalDate paymentDate) {
			this.paymentDate = paymentDate;
		}
		public LocalTime getPaymentTime() {
			return paymentTime;
		}
		public void setPaymentTime(LocalTime paymentTime) {
			this.paymentTime = paymentTime;
		}
		public double getTotal() {
			return total;
		}
		public void setTotal(double total) {
			this.total = total;
		}
		public PaymentStatus getStatus() {
			return status;
		}
		public void setStatus(PaymentStatus status) {
			this.status = status;
		}
		public PaymentMethod getMethod() {
			return method;
		}
		public void setMethod(PaymentMethod method) {
			this.method = method;
		}
		@Override
		public String toString() {
			return "Payment [paymentId=" + paymentId + ", bookingId=" + bookingId + ", paymentDate=" + paymentDate
					+ ", paymentTime=" + paymentTime + ", total=" + total + ", status=" + status + ", method=" + method
					+ "]";
		}

			
		

	}

