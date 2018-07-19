package abstractiontest;

public class customer extends Xyzhonda {
	public void engine() {
		System.out.println("500cc");
	}
	public static void main(String[] args) {
		customer obj=new customer();
		obj.color();
		obj.engine();
		obj.gears();
		obj.tyres();
	}

}
