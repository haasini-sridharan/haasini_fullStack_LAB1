package com.greatlearning.service;

import java.util.Random;

import com.greatlearning.model.Employee;

public class EmployeeServiceImpl implements EmployeeService  {

	@Override
	public String generateEmailID(String fname, String lname, String deptName) {
		return fname.toLowerCase()+lname.toLowerCase()+"."+deptName+"@greatlearning.com";
	}

	@Override
	public String generatePassword() {
		// TODO Auto-generated method stub
		String capitals ="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String lower ="abcdefghijklmnopqrstuvwxyz";
		String numbers="0123456789";
		String spl= "!@#$%^&*()";
		String combine= capitals+lower+numbers+spl;
		Random random =new Random();
		String myPass ="";

		for(int i =1;i<=8;i++)
		{
			myPass +=String.valueOf(combine.charAt(random.nextInt(combine.length())));
		}
				
		return myPass;
	}

	@Override
	public void showEmployeeDetails(Employee e) {
		// TODO Auto-generated method stub
		System.out.println("Employee First Name is : " +e.getFirstName());
		System.out.println("Employee Last Name is : " +e.getLastName());
		System.out.println("Employee Email is : " +e.getEmail());
		System.out.println("Employee password is : " +e.getPassword());
	}
	

}
