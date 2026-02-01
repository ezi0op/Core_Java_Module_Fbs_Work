package comparator;

import java.util.*;

public class mySalaryComparator implements Comparator<Employee> {

	public int compare(Employee o1, Employee o2) {

		return (int) (o1.salary - o2.salary);
	}

}
