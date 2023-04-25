package strategy;

public class Implementation {
	
	public static void main(String args[]) {
		ShoppingCart cart = new ShoppingCart(400);
		
		cart.pay(new PhonePePaymentMethod("9087654321"));
		
		cart.pay(new CreditCardPaymentMethod("Rp kumar", "1234567890123456", "546", "10/27"));
	}
}
