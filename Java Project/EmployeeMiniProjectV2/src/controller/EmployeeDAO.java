package controller;

import java.util.*;

import model.Admin;
import model.Employee;
import model.Hr;
import model.SalesManager;

public class EmployeeDAO {

	public List<Employee> l = new ArrayList<>();

	Employee e1 = new Hr(104, "Vaibhav", 51000, 5200);
	Employee e2 = new Hr(105, "Komal", 49500, 4800);
	Employee e3 = new Hr(106, "Nikhil", 53000, 5500);
	Employee e4 = new SalesManager(204, "Sagar", 61000, 14, 8200);
	Employee e5 = new SalesManager(205, "Ankita", 59500, 16, 7800);
	Employee e6 = new SalesManager(206, "Vikas", 64000, 11, 9200);
	Employee e7 = new Admin(305, "Tanvi", 71000, 10500);
	Employee e8 = new Admin(306, "Gaurav", 69000, 9800);
	Employee e9 = new Admin(307, "Neha", 73500, 11500);
	Employee e10 = new Admin(308, "Omkar", 76000, 12500);

	public EmployeeDAO() {

		l.add(e1);
		l.add(e2);
		l.add(e3);
		l.add(e4);
		l.add(e5);
		l.add(e6);
		l.add(e7);
		l.add(e8);
		l.add(e9);
		l.add(e10);
	}

	public boolean addEmployee(Employee e) {
		// TODO Auto-generated method stub

		return l.add(e);
	}

	public Employee searchEmployee(int id) {
		for (Employee e : l) {

			if (e.getEid() == id) {
				return e;
			}
		}
		return null;
	}

	public boolean updateEmployee(int id, double salary) {
		for (Employee e : l) {
			if (e.getEid() == id) {
				e.setSalary(salary);
				return true;
			}
		}
		return false;
	}

	public boolean deleteEmployee(int id) {
		for (Employee e:l) {
			
			if (e.getEid() == id) {
				l.remove(e);
				return true;
			}
		}
		return false;
	}

	public void displayAll() {
		for (Employee e : l) {
			System.out.println(e);
		}
	}

	public EmployeeDAO getDAO() {
		// TODO Auto-generated method stub
		return this;
	}

}
