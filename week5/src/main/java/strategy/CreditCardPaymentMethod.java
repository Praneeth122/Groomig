package strategy;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class CreditCardPaymentMethod implements PaymenthMethod{
	
	private String name;
	private String cardNumber;
	private String cvv;
	private String dateOfExpiry;
	
	@Override
	public void pay(int price) {
		System.out.println(name + " paid "+ Integer.valueOf(price).toString() +" through the credit card");
	}

}
