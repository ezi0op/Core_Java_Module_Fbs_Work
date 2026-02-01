package com.main;

import java.util.Scanner;
import com.loginService.LoginService;

public class MainApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        LoginService service = new LoginService();

        int choice;

        do {
            System.out.println("\n===== LOGIN MENU =====");
            System.out.println("1. Create User");
            System.out.println("2. Login");
            System.out.println("3. Display Users");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    service.createUser();
                    break;

                case 2:
                    boolean status = service.validateUser();
                    if (status) {
                        System.out.println("---- Login Successful!");
                    } else {
                        System.out.println("---- Invalid Username or Password!");
                    }
                    break;

                case 3:
                    service.displayUsers();
                    break;

                case 4:
                    System.out.println("---- Thank You!");
                    break;

                default:
                    System.out.println("---- Invalid Choice!");
            }

        } while (choice != 4);

        sc.close();
    }
}
