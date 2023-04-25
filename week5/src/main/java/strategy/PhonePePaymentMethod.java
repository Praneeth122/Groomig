package strategy;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class PhonePePaymentMethod  implements PaymenthMethod{
	private String number;

	@Override
	public void pay(int price) {
		System.out.println(number + " paid "+ Integer.valueOf(price).toString() +" through the phonepe");
		
	}
}
