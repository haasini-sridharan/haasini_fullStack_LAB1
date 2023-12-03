package com.greatlearning.app;

import java.util.Scanner;

import com.greatlearning.model.Employee;
import com.greatlearning.service.EmployeeServiceImpl;

public class EmployeeMain {

	public static void main(String[] args) {
		
		EmployeeServiceImpl empImpl =new EmployeeServiceImpl();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your First Name");
		String firstName =sc.next();
		
		System.out.println("Enter your Last Name");
		String lastName =sc.next();
		
		System.out.println("Please choose department");
		System.out.println("1. Technical");
		System.out.println("2. Admin");
		System.out.println("3. Human Resource");
		System.out.println("4. Legal");
		int choice =sc.nextInt();
		String genEmail="";
		switch(choice) {
		case 1: genEmail=empImpl.generateEmailID(firstName, lastName, "tech");break;
		case 2: genEmail=empImpl.generateEmailID(firstName, lastName, "admin");break;
		case 3: genEmail=empImpl.generateEmailID(firstName, lastName, "hr");break;
		case 4: genEmail=empImpl.generateEmailID(firstName, lastName, "legal");break;
		default: System.out.println("please enter valid input");
		}
		String genPassword= empImpl.generatePassword();
		Employee e1= new Employee();
		e1.setFirstName(firstName);
		e1.setLastName(lastName);
		e1.setEmail(genEmail);
		e1.setPassword(genPassword);
		
		empImpl.showEmployeeDetails(e1);

	}

}
