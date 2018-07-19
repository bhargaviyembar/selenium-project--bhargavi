package abstractiontest;

public class Imphonda implements Abchonda{

		public void speed() {
		// TODO Auto-generated method stub
			System.out.println("180km");
	}

		public void shape() {
		// TODO Auto-generated method stub
	System.out.println("cylinder");	
	}

		public void capacity() {
		// TODO Auto-generated method stub
			System.out.println(2);	
	}
public static void main(String[] args) {
	Imphonda obj=new Imphonda();
	obj.capacity();
	obj.shape();
	obj.speed();

}
}
