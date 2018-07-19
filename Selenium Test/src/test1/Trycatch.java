package test1;

public class Trycatch {
public void A(int i, int j) {
	int x=i;
	int y=j;
try {
	System.out.println(x/y);
} catch (Exception e) {
 System.out.println("infinity cannot divide");
}	
}
//public static void main(String[] args) {
//	
//Trycatch obj=new Trycatch();
//obj.A(10,2);
//}
}
