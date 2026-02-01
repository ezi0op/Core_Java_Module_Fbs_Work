package view;

import java.util.*;

import model.*;

public class myIdComparator implements Comparator<Employee> {
	public int compare(Employee o1, Employee o2) {

		return o1.getEid() - o2.getEid();
	}
}
