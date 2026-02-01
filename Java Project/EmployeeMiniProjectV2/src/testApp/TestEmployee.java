package testApp;

import controller.EmployeeController;
import view.EmployeeView;

public class TestEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		EmployeeController ec = new EmployeeController();
		EmployeeView  view = new EmployeeView(ec);
		view.showOptions();
		
	}

}
