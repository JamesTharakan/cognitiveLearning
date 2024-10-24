package utils;

import collection.equalsHashcode.BasicEqualsHashCode;

public class Customer {

	private int id =-1;
	private String name;

	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}


	public Customer() {
	}
	public Customer(String name) {
		this.name = name;
	}

	public Customer(int id) {
		this.id = id;
	}


	public Customer(int id, String name) {
		this.id = id;
		this.name = name;
	}


	public String toString() {

		return "[id=" + id + ",name=" + name + "]";
	}
	
	public int hashCode() {
		return name.length();
	}
	
	public boolean equals(Object Obj) {
		if (this ==Obj)
			return true;
		
		if(!(Obj instanceof Customer))
			return false;
		
		Customer cust = (Customer)Obj;
		return cust.id == this.id;
	}
}