package CRUD;

public class Employee {
    static int id=1;
	private String name;
	private int EmpId;

	long phone_number;
	private String email;
	private String address;
	private int salary;
	
	
	public Employee(String name, long phone_number, String email, String address, int salary) {
		super();
		this.name = name;
		this.phone_number = phone_number;
		this.email = email;
		this.address = address;
		this.salary = salary;
		this.EmpId=id;
		id+=1;
		
	}

	public int getEmpId() {
		return EmpId;
	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getPhone_number() {
		return phone_number;
	}

	public void setPhone_number(int phone_number) {
		this.phone_number = phone_number;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}
	


	
	
}
