package Test;

import java.util.TreeMap;

import Model.Employee;

public class TestEmp3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeMap<MyKey,Employee> tm1 = new TreeMap<MyKey,Employee>();
		
		tm1.put(new MyKey(101),new Employee(101,"Amit",23123));
		tm1.put(new MyKey(10), new Employee(107,"Ajay",22323));
		tm1.put(new MyKey(102), new Employee(107,"Ajay",22323));
		tm1.put(new MyKey(103), new Employee(103,"sad",654));
		tm1.put(new MyKey(107), new Employee(107,"Ajay",22323));
		
//		if(tm1.containsKey(new MyKey(103))) {
//			System.out.println("Found");
//		}else {
//			System.out.println("Not Found");
//		}
		
		
		System.out.println(tm1);
	}

}
