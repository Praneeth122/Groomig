package command;

public class Implementation {
	
	public static void main(String[] args) {
		
		ApplianceOn apllianceOn =  new ApplianceOn(new Light());
	
		Invoker invoker = new Invoker(apllianceOn);
		
		invoker.execute();
	}
}
