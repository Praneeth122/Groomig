package state;

public class Implementation {
	public static void main(String ags[]) {
		TV tv = new TV();
		
		tv.setState("ON");
		tv.doAction();
		
		tv.setState("OFF");
		tv.doAction();
	}
}
