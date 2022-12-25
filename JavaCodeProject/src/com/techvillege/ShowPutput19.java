package com.techvillege;

public class ShowPutput19 {

	public static void main(String[] args) {
		B b = new B();
		System.out.println(b.i);
	}

}

class A{
	static int i=300;
	static {
		i=i-- - --i;
		System.out.println("First: "+i);
	}
	{
		i=i++ + ++i;
		System.out.println("Second: "+i);
	}
}

class B extends A{
	static {
		i=--i - i--;
		System.out.println("Third: "+i);
	}
	{
		i=++i + i++;
		System.out.println("Forth: "+i);
	}
}