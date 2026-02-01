package comparator;

import java.util.*;


public class   myIdComparator implements Comparator<Employee> {
	public int compare(Employee o1, Employee o2) {
	

		return o1.eid-o2.eid;
	}
}


