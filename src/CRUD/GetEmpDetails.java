package CRUD;

import DataBase.Storage;



public class GetEmpDetails {

  public void getDetails(int id) {
	  
	  System.out.println(Storage.EmpDetails.get(id).getName()+"\n"+Storage.EmpDetails.get(id).getEmail()+"\n"+Storage.EmpDetails.get(id).getSalary());
  }
  
	
}
