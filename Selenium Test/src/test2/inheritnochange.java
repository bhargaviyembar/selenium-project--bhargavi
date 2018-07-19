package test2;

import test1.Trycatch;

public class inheritnochange extends methdcalling {

	public void B(int f,int g) {
		int m=f;
		int n=g;
		int o=m/n;
		System.out.println(o);
	}
	public static void main(String[] args) {
		inheritnochange obj=new inheritnochange();
		obj.B(40, 20);
		obj.A(10,0);
		obj.A(3, 2, 5);
		
	}
}

