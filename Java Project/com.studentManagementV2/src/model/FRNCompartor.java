package model;

import java.util.Comparator;

public class FRNCompartor  implements Comparator<Student>{

	@Override
	public int compare(Student o1, Student o2) {
		// TODO Auto-generated method stub
		return o1.getFrn().compareTo(o2.getFrn());
	}
}
