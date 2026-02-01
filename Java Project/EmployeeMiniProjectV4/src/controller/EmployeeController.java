package controller;


import model.Employee;

public class EmployeeController {
	EmployeeDAO ed = new EmployeeDAO();
	public void addEmployee(Employee e) {
		// TODO Auto-generated method stub
		if(ed.addEmployee(e)) {
			System.out.println("Successfull!!!");
			}else {
				System.out.println("Failed to Add Employee!");
			}
	}

	public Employee searchEmployeeByID(int id) {
		// TODO Auto-generated method stub
		return ed.searchEmployee(id);
		
	}

	public boolean updateEmployee(int id, double salary) {
		// TODO Auto-generated method stub
		
		if(ed.updateEmployee(id, salary)) {
			return true;
		}
		return false;
	}

	public boolean deleteEmployee(int id) {
		// TODO Auto-generated method stub
		if(ed.deleteEmployee(id))
		{
			return true;
		}
		return false;
	}

	public void displayAll() {
		// TODO Auto-generated method stub
		ed.displayAll();
		
	}

	public EmployeeDAO getDAO() {
		// TODO Auto-generated method stub
		return ed;
	}
	
	

	
}
