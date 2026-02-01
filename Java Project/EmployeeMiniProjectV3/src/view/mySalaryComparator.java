package view;

import java.util.Comparator;

import model.Employee;

public class mySalaryComparator implements Comparator<Employee>  {

	@Override
	public int compare(Employee o1, Employee o2) {

		return (int) (o1.getSalary() - o2.getSalary());
	}
}
