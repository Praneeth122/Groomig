package template;

public class Implementation {

	public static void main(String[] args) {
		
		House house = new WoodenHouse();
		
		house.buildHouse();
		
		house = new GlassHouse();
		
		house.buildHouse();
	}
}
