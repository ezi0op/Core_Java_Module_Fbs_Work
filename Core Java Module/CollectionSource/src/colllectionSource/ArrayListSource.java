package colllectionSource;

import java.util.ArrayList;

public class ArrayListSource {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList a1 =  new ArrayList();
		
		a1.add(10);
		a1.add(30);
		a1.add(20);
		
		
		
		
		
		a1.remove(1);
		
		if(a1.contains(30)) {
			System.out.println("Found");
		}else {
			System.out.println("Not Found");
		}
	}

}
