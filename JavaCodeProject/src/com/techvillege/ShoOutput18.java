package com.techvillege;

public class ShoOutput18 extends Parent{
	public static void foo() {
		System.out.println("I am foo in child");
	}
	public static void bar() {
		System.out.println("I am bar in child");
	}

	public static void main(String[] args) {
		Parent par = new ShoOutput18();
		ShoOutput18 child=new ShoOutput18();
		System.out.println("par.foo()");
		par.foo();
		System.out.println("child.foo()");
		child.foo();
		
		par.bar();
		child.bar();

	}

}
class Parent{
	public static void foo() {
		System.out.println("I am foo in super");
	}
	public static void bar() {
		System.out.println("I am bar in super");
	}
}