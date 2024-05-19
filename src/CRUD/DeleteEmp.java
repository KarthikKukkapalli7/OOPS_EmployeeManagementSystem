package CRUD;
import DataBase.Storage;

public class DeleteEmp {
	
	public void deleteEmp(int id) {
		Storage.EmpDetails.remove(id);
	}

}
