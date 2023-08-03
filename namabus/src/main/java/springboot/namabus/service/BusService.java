package springboot.namabus.service;

import java.util.List;

import org.springframework.stereotype.Service;

import springboot.namabus.entities.Bus;

@Service
public interface BusService {
	public List<Bus> getBuses();   //
	public Bus addBuses(Bus bus);
	public Bus updateBuses(Bus bus);
public String deleteBusById(int bus_Id);
	//public Bus getBusById(int bus_id);
	Bus getBusById(int Bus_id);
	
	
	

}
