package com.emp.module;

import java.util.*;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		EmployeeManagement empMgr=new EmployeeManagement();
		
		
		
		
		Scanner sc= new Scanner(System.in);
		int choice;
		
		do {
			System.out.println("\t1.Add ");
			System.out.println("\t2.Search (By Id)  ");
			System.out.println("\t3.Update (By Id)");
			System.out.println("\t4.Delete (By Id) ");
			System.out.println("\t5.Display(All)");
			System.out.println("\t6.Exit");
			System.out.println("Enter your choice...:");
			choice=sc.nextInt();
			
			switch (choice) {
			case 1:
			{
				empMgr.addEmp();
				
			}
				break;
			case 2:
			{
				empMgr.searchEmp();
			}
			break;
			case 3:
			{
				empMgr.updateEmp();
			}
			break;
			case 4:
			{
				empMgr.deleteEmp();
			}
			break;
			case 5:
			{
				empMgr.displayAll();
			}
			break;
			case 6:
			{
				System.out.println("Exiting.....");
				break;
				
			}
			
			default:
			{
			System.out.println("-------Invalid Choice!------");	
			}
				break;
			}
		} while (choice!=6);

	}

}
