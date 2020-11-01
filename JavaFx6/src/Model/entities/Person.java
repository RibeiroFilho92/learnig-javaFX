package Model.entities;

import java.io.Serializable;

public class Person implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private Integer ID;
	private String name;
	private String email;
	
	public Person(Integer iD, String name, String email) {
		ID = iD;
		this.name = name;
		this.email = email;
	}
	
	public Integer getID() {
		return ID;
	}
	public void setID(Integer iD) {
		ID = iD;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Person [ID=" + ID + ", name=" + name + ", email=" + email + "]";
	}
	
	
}
