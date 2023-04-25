package Observer;

public class Implementation {
	
	public static void main(String args[]) {
		Subject topic1 = new Topic1();
		Observer Subcriber1 = new Subcriber1();
		Observer Subcriber2 = new Subcriber2();
		
		topic1.postMeassage("Welcome no one can see this");
		
		topic1.addObserver(Subcriber1);
		topic1.postMeassage("This is first message, only sub 1 can see");
		
		topic1.addObserver(Subcriber2);
		topic1.postMeassage("Sub2 also added !");

	}
}
