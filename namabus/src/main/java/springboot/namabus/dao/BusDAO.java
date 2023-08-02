package springboot.namabus.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import springboot.namabus.entities.Bus;

public interface BusDAO extends JpaRepository<Bus,Integer>{

	
	

}
