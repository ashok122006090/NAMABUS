package springboot.namabus.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import springboot.namabus.entities.Booking;

 



 

@Repository("dto")
public interface BookingRepo extends JpaRepository<Booking, Integer> {

 

}