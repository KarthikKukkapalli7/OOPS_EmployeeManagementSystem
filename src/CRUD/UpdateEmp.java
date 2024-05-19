package CRUD;
import DataBase.Storage;
import java.util.Scanner;

public class UpdateEmp {
	
	public void updateDB(int id) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter /n 1 for update name  \n 2 for update salary ");
		System.out.println("Please enter details");
		int val=sc.nextInt();
		if(val==1) {
			String name = sc.next();
			Storage.EmpDetails.get(id).setName(name);
		}else{
			int salary =sc.nextInt();
			Storage.EmpDetails.get(id).setSalary(salary);
		}

	}

}
