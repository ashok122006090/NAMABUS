package springboot.namabus.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

import org.springframework.web.bind.annotation.RequestParam;

import springboot.namabus.entities.Bus;
import springboot.namabus.service.BusService;
//@Api
@RestController
//@ApiOperation(value = "")
@CrossOrigin
//@RequestMapping("/api")
//@ApiOperation(value = "Get a simple greeting", notes = "This endpoint returns a simple greeting message.")
public class BusController {
	@Autowired
	
	private BusService busService;


	@GetMapping ("/buses/{id}")
	public Bus getBusById(@PathVariable int id) {
		return this.busService.getBusById(id);}

	@GetMapping ("/buses")//

	public ResponseEntity<Bus> getBuses(){

	List<Bus> BusImpl =busService.getBuses();
	return new ResponseEntity (BusImpl, HttpStatus.OK) ;}
		
	@PostMapping("/buses")

	public ResponseEntity<Bus> addBuses (@RequestBody Bus busDAO) {
		Bus busImpl =busService.addBuses(busDAO);

	return new ResponseEntity(busImpl, HttpStatus. CREATED);}


	@PutMapping("/buses")

	public ResponseEntity<Bus> updateBuses (@RequestBody Bus bus){
		Bus busImpl = busService.updateBuses (bus);
		return new ResponseEntity (busImpl,HttpStatus.ACCEPTED); }

//
	@DeleteMapping ("/buses/{bus_Id}")
	public void deletebusById(@PathVariable int bus_Id) {
		 this.busService.deleteBusById(bus_Id);
	}

	

}
