package springboot.namabus.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import springboot.namabus.entities.Bus;
@Repository
public interface BusDAO extends JpaRepository<Bus,Integer>{

	
	

}
