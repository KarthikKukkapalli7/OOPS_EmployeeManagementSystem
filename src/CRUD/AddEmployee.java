package CRUD;

import java.util.*;

import DataBase.Storage;


public class AddEmployee {

	

	public void addEmp() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please enter below details");
		
		System.out.println("Please enter Employee Name");
		String name = sc.next();
		System.out.println("Please enter phone number");
		
		long number = sc.nextLong();
		System.out.println("Please enter email");
		String email = sc.next();
		System.out.println("Please enter Address");
		String address = sc.next();
		System.out.println("Please enter salary");
	
		int salary = sc.nextInt();
		Employee emp = new Employee(name, number, email, address, salary);
		int id=emp.getEmpId();
		Storage.EmpDetails.put(emp.getEmpId(), emp);
		System.out.println("The employee details are succesfully added please check \n"+id+"\n"+Storage.EmpDetails.get(id).getName()+"\n"+Storage.EmpDetails.get(id).getEmail()+"\n"+Storage.EmpDetails.get(id).getSalary());

		
		
	}
}
