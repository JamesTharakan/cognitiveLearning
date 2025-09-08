package utils;

public class Person {
	private String firstName;
	private String lastName;
	private int age;
	public int sal;
	
	public Person(String firstName, String lastName, int age) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
	}
	
	public Person(String firstName, int age, int sal) {
		super();
		this.firstName = firstName;
		this.age = age;
		this.sal= sal;
	}
	public int getSal() {
		return sal;
	}

	public void setSal(int sal) {
		this.sal = sal;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	
	public String toString() {
		return /* "Person::" + */firstName + " " + lastName + " : " + age ;
	}

}
