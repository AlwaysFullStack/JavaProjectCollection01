package com.webdriver.selenium.techvillege;

import java.util.ArrayList;
import java.util.List;

public class ListInJava {
	public  static void main(String args[]) {
		String car1="BMW";
		String[] cars= {"BMW", "Toyota", "Nissan", "Honda", "Marcedees", "Lexus"};
		System.out.println(cars.length);
		
		int i=0;
		System.out.println("Print Array Elements:");
		while(i<cars.length) {
			System.out.println(cars[i]);
			i++;
		}
		
		List<String> students=new ArrayList<String>();
		students.add("Boris Johnson");
		students.add("Theresa May");
		students.add("David Brown");
		students.add("Gordon Brown");
		students.add("Tony Blair");
		students.add("John Major");
		students.add("Margaret Thatcher");
		students.add("James Callaghan");
		
		System.out.println("Print List Elements using for (foreach):");
		for(String student:students) {
			i++;
			System.out.println(i+". "+student);
		}
		
		System.out.println('\n');
		int j=0;
		int listLength=students.size();
		System.out.println("Print List Elements using classic while loop:");
		while(j<listLength) {
			System.out.println(students.get(j));
			j++;
		}
		
		int k=listLength-1;
		System.out.println("Print List Elements using classic while loop in descending order:");
		while(k>-1) {
			System.out.println(students.get(k));
			k--;
		}	
	}
}
