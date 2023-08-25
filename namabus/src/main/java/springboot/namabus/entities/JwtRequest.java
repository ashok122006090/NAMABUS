package springboot.namabus.entities;

 

import java.util.Set;


 



 

import lombok.*;

@Getter

@Setter



@Builder

@ToString

public class JwtRequest {


    private String username;


    private String password;


	public String getUsername() {
		return username;
	}


	public void setUsername(String username) {
		this.username = username;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	@Override
	public String toString() {
		return "JwtRequest [username=" + username + ", password=" + password + ", getUsername()=" + getUsername()
				+ ", getPassword()=" + getPassword() + "]";
	}


	public JwtRequest(String username, String password) {
		super();
		this.username = username;
		this.password = password;
	}


	public JwtRequest() {
		super();
		// TODO Auto-generated constructor stub
	}




}
