package Run;

import java.util.Scanner;
import CRUD.AddEmployee;
import CRUD.GetEmpDetails;
import CRUD.DeleteEmp;
import CRUD.UpdateEmp;

public class EmployeeManagementSystem {
	public static void main(String[] args) {
		System.out.println("Welcome to Employee management system");
		while(true) {
		System.out.println("Please cloose below option");
		System.out.println("1 - to add employee \n2 - to get employee details \n3 - update employee details \n"
				+ "4 - delete employee ");
		Scanner sc = new Scanner(System.in);
		int val = sc.nextInt();
		if(val==1) {
			AddEmployee addEmpoye = new AddEmployee();
			addEmpoye.addEmp();
		}else {
			System.out.print("Please enter employee id \n");
			int id = sc.nextInt();
			if(val==2) {
				GetEmpDetails getEmpDetails = new GetEmpDetails();
				getEmpDetails.getDetails(id);
				
			}else if(val==3) {
				UpdateEmp updateEmp = new UpdateEmp();
				updateEmp.updateDB(id);
			}else {
				DeleteEmp deleteEmp = new DeleteEmp();
				deleteEmp.deleteEmp(id);
			}
			
		}
		
		}
		
	}

}
