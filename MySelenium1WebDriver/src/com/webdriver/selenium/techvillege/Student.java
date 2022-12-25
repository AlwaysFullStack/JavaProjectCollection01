package com.webdriver.selenium.techvillege;

public class Student {
	public static int Id;
	public static String firstName;
	public static String lastName;
	
	Student(int id, String fn, String ln){
		Id=id;
		firstName=fn;
		lastName=ln;
	}
	
	static void getDetails() {
		System.out.println("Id: "+Id+", First Name: "+firstName+", Last Name:"+lastName);
	}

}
