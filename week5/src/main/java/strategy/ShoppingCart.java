package strategy;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class ShoppingCart {
		int totalprice;
		
		public void pay(PaymenthMethod method) {
			method.pay(this.totalprice);
		}
}
