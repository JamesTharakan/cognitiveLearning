package utils;

public class Employee {

	private long id;
	private String name;
	private int salary;
	private String department;

	public Employee(long id, String name, int salary, String department) {
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.department = department;
	}

	public long getID() {
		return this.id;
	}

	public int getSalary() {
		return this.salary;
	}

	public String toString() {
		return "Employee [id=" + id + "," + " name=" + name + "," + " salary=" + salary + "," + " department="
				+ department + "]";
	}
}