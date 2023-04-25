package template;

public abstract class House {
	
	public void buildFoundation() {
		System.out.println("Building foundation with cement,iron rods and sand");
	}
	
	private void buildWindows() {
		System.out.println("Building Glass Windows");
	}
	
	
	public abstract void buildWalls();
	public abstract void buildPillars();
	
	public final void buildHouse(){
		buildFoundation();
		buildPillars();
		buildWalls();
		buildWindows();
		System.out.println("House is built.");
	}
	
}
