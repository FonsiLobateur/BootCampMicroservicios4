package com.nttdata.bootcamp.webfluxservermicro.persona;

public class Persona {
	
	public String firstname;
	public String lastname;
	public int age;
	
	
	public Persona(String firstname, String lastname, int age) {
		this.firstname = firstname;
		this.lastname = lastname;
		this.age = age;
	}


	public String getFirstname() {
		return firstname;
	}


	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}


	public String getLastname() {
		return lastname;
	}


	public void setLastname(String lastname) {
		this.lastname = lastname;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}
	
	
	
	
	
	

}
