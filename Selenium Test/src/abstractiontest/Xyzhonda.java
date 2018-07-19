package abstractiontest;

public class Xyzhonda extends Honda {
	//int t1 = 2;
	//String c1 = "Red";

	public void tyres() {
		Xyzhonda t1 = new Xyzhonda();
		System.out.println(2);

	}

	public void color() {
		// TODO Auto-generated method stub
		Xyzhonda c1 = new Xyzhonda();
		System.out.println("red");
	}

	public static void main(String[] args) {
Xyzhonda obj=new Xyzhonda();

obj.color();
obj.gears();
obj.tyres();

	}
}
