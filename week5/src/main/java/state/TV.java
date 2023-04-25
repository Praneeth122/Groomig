package state;

public class TV {
	String state;
	
	public void setState(String state) {
		this.state=state;
	}
	
	public void doAction() {
		if(this.state=="ON")
		{
			System.out.println("TV is ON");
		}
		else
		{
			System.out.println("TV is OFF");
		}
	}
}
