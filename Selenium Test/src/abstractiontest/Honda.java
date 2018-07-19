package abstractiontest;

abstract public class Honda {
	Integer  g= 6;
	abstract public void tyres();

	public void gears() {
		System.out.println(g);
	}

	abstract public void color();
}
