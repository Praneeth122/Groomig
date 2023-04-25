package decorator;

public class Implementation {
	 public static void main(String args[])
	    {

	        Pizza pizza = new FramHouse();
	 
	        pizza = new Paneer(pizza);
	 
	 
	        System.out.println( pizza.getDescription() +" Cost :" + pizza.getCost());
	   }
}
