package springboot.namabus.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity



@Table(name = "Bus")
public class Bus {

    @Id

    //@GeneratedValue(strategy = GenerationType.IDENTITY)

    private int id;

    @Column(name = "price")

     int price;

    @Column(name = "seats")

     int seats;

    @Column(name = "amenities")

     String amenities;

 

    public Bus() {

        super();

    }



	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public int getPrice() {
		return price;
	}



	public void setPrice(int price) {
		this.price = price;
	}



	public int getSeats() {
		return seats;
	}



	public void setSeats(int seats) {
		this.seats = seats;
	}



	public String getAmenities() {
		return amenities;
	}



	public void setAmenities(String amenities) {
		this.amenities = amenities;
	}



	public Bus(int id, int price, int seats, String amenities) {
		super();
		this.id = id;
		this.price = price;
		this.seats = seats;
		this.amenities = amenities;
	}



	@Override
	public String toString() {
		return "Bus [id=" + id + ", price=" + price + ", seats=" + seats + ", amenities=" + amenities + "]";
	}





  
 

}