package test1;// This keyword

public class Cthis {
	String empname;
	Integer empid;
	String empsalary;
	String empdesig;

	public Cthis (String empname,Integer empid,String empsalary,String empdesig) 
	{
		this.empname=empname;
		this.empid=empid;
		this.empsalary=empsalary;
		this.empdesig=empdesig;
	}

	public static void main(String[] args) {
		Cthis e1 = new Cthis("ABC", 1, "5 Lackhs", "SE");
		System.out.println(e1.empname);
		System.out.println(e1.empsalary);
		System.out.println(e1.empdesig);
		System.out.println(e1.empid);

		Cthis e2 = new Cthis("XYZ", 2, "4 Lackhs", "SE");
		System.out.println(e2.empname);
		System.out.println(e2.empsalary);
		System.out.println(e2.empdesig);
		System.out.println(e2.empid);
	}
}
