package view;

import java.util.Comparator;

import model.Employee;

public class myNameComparator implements Comparator<Employee> {

	public int compare(Employee o1, Employee o2) {

		return o1.getName().compareTo(o2.getName());
	}
}