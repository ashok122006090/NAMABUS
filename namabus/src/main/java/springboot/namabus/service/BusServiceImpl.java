package springboot.namabus.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sprinboot.namabus.exception.BusNotFoundException;
//import sprinboot.namabus.exception.BusNotFoundException;
import springboot.namabus.dao.BusDAO;
import springboot.namabus.entities.Bus;
@Service
public class BusServiceImpl implements BusService{
	@Autowired 
	private BusDAO busDAO;
	@Override
	public List<Bus> getBuses(){

	return busDAO.findAll();

}

	
   @Override
	public Bus addBuses(Bus bus){

	busDAO.save (bus);

	return bus;

	}
   @Override
   public Bus getBusById(int Bus_id) {
	   return null;
   }


@Override
public Bus updateBuses(Bus bus) {
  busDAO.save(bus);
	return bus;
}


@Override
public String deleteBusById(int bus_Id) throws BusNotFoundException {
	Optional<Bus> bus = busDAO.findById(bus_Id);
	String messsage =null;
	if(bus.isPresent()) {
		busDAO.deleteById(bus_Id);
		messsage = new String("bus deleted succssfully");
	}
	else {
		throw new BusNotFoundException("no such Bus");
	}
	// TODO Auto-generated method stub
	return messsage;
}


//@Override
//public String deleteBusById(int bus_Id) {
//	// TODO Auto-generated method stub
//	busDAO.deleteById(bus_Id);
//	return "bus deleted";
//}

//	@Override
//
//	public Bus updateBuses (Bus bus) {
//
//	// TODO Auto-generated method xtub
//
//	busDAO. save (bus);
//
//	return bus;}

//	@Override
//
//	public String deleteBusById(int busId) throws BusNotFoundException {
//
//	Optional <Bus> bus= busDAO.findById(busId);
//
//	String message =null;
//
//	if (bus.isPresent()) {
//
//	busDAO.deleteById(busId);
//
//	message =new String("Bus Record deleted successfully.");} 
//	else {
//
//	throw new BusNotFoundException("No such Bus") ;}
//
//	return message; }

	
    

//	@Override
//	public String deleteBusById(int bus_Id) {
//		// TODO Auto-generated method stub
//		return null;
//	}

}
