package springboot.namabus;

import static org.mockito.Mockito.when;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockBean;

import springboot.namabus.dao.BusDAO;
import springboot.namabus.entities.Bus;
import springboot.namabus.service.BusService;



public class BusTest{



@MockBean

private BusDAO busDAO;

@Autowired



private BusService busService;

@Test



public void getAllBusesTest() {

((Stream<Bus>) when (busDAO.findAll()).thenReturn((List<Bus>) Stream.of( new Bus (3, 270, 38,null, "kurnool", "kadap")))).collect

(Collectors.toList());

}}