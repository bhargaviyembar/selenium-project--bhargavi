package test1;//constructor

public class B {
	boolean Value;
	String str;

	public B(boolean x, String y) {
		x = Value;
		y = str;
	}

	public static void main(String[] args) {
		B objname = new B(false, "testing");
		System.out.println(objname.Value);
		System.out.println(objname.str);
		B obj1 = new B(true, null);
		System.out.println(obj1.Value);
		System.out.println(obj1.str);
	}

}
