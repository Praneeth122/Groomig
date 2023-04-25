package facade;

public class Samsung implements Mobile{

	@Override
	public void name() {
		System.out.println("Samsung");
	}

	@Override
	public void price() {
		System.out.println(60000);
	}

}
