package facade;

public class Iphone implements Mobile {

	@Override
	public void name() {
		System.out.println("Iphone");
	}

	@Override
	public void price() {
		System.out.println(90000);
	}


}
