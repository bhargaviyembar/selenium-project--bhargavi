package test1; // Constructor

import test2.methdcalling;

public class A extends methdcalling{

	boolean Value;
	String str;
	public void test1 ()
	{
		System.out.println("test1");
	}
	public A (boolean x, String y)
	{ Value = x;
	str = y;
	}
	public static void main(String[] args) {
	A obj = new A (false,"testing");
	System.out.println (obj.Value);
	System.out.println (obj.str);
	A obj1 = new A (true,null);
	System.out.println(obj1.Value);
	System.out.println(obj1. str);
	obj.A(4, 7, 9);
	
	}

}
