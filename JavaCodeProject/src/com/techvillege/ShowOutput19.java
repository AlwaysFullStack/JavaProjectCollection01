package com.techvillege;

public class ShowOutput19 {
	public static class A{
		A(){
			this(0);
			System.out.println("Hi");
			
			
		}

		A(int x) {
			this(0, 0);
			System.out.println("Hi");
		}

		A(int i, int j) {
			System.out.println("How are you");
		}
	}

	public static void main(String[] args) {
		A obj=new A();

	}

}
