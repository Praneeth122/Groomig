package Observer;

public class Subcriber2 implements Observer{

	@Override
	public void updateMessage(String message) {
		System.out.println(this.getClass() + " : "+ message);
	}
	
}
