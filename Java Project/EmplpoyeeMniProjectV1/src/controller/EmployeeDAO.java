package controller;

import model.Admin;
import model.Employee;
import model.Hr;
import model.SalesManager;

public class EmployeeDAO {

	static Employee[] eArr;
	static int count;

	static {
		eArr = new Employee[11];
		count = 0;
		eArr[count++] = new Hr(104, "Vaibhav", 51000, 5200);
		eArr[count++] = new Hr(105, "Komal", 49500, 4800);
		eArr[count++] = new Hr(106, "Nikhil", 53000, 5500);
		eArr[count++] = new SalesManager(204, "Sagar", 61000, 14, 8200);
		eArr[count++] = new SalesManager(205, "Ankita", 59500, 16, 7800);
		eArr[count++] = new SalesManager(206, "Vikas", 64000, 11, 9200);
		eArr[count++] = new Admin(305, "Tanvi", 71000, 10500);
		eArr[count++] = new Admin(306, "Gaurav", 69000, 9800);
		eArr[count++] = new Admin(307, "Neha", 73500, 11500);
		eArr[count++] = new Admin(308, "Omkar", 76000, 12500);
	}

	public boolean addEmployee(Employee e) {
		// TODO Auto-generated method stub
		if (count < eArr.length) {
			eArr[count++] = e;
			return true;
		}
		return false;
	}
	
	public Employee searchEmployee(int id) {
		for(int i=0;i<count;i++) {
			if(eArr[i].getEid()==id) {
				return eArr[i];
				
			}
		}
		return null;
	}

	public boolean updateEmployee(int id,double salary) {
		for(int i=0;i<count;i++) {
			if(eArr[i].getEid() == id) {
				eArr[i].setSalary(salary);
				return true;
			}
		}
		return false;
	}
	
	public boolean deleteEmployee(int id) {
		for(int i=0;i<count;i++) {
			if(eArr[i].getEid()==id) {
				for(int j=i;j<count-1;j++) {
					eArr[j]=eArr[j+1];
				}
				eArr[count-1]=null;
				count--;
				return true;
			}
		}
		return false;
	}
	
	public void displayAll() {
		for(int i=0;i<count;i++) {
			System.out.println(eArr[i]);
		}
	}
	
	

}
