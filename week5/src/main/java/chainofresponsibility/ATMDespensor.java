package chainofresponsibility;

import java.util.Scanner;

public class ATMDespensor{
	private DispenseChain c1;

	public ATMDespensor() {

		this.c1 = new Doller100Dispenser();
		DispenseChain c2 = new Doller50Dispenser();
		DispenseChain c3 = new Doller10Dispenser();

	
		c1.setNextChain(c2);
		c2.setNextChain(c3);
	}

	public static void main(String[] args) {
		ATMDespensor atmDispenser = new ATMDespensor();
		
			int amount = 0;
			System.out.println("Enter amount to dispense");
			Scanner input = new Scanner(System.in);
			amount = input.nextInt();
			if (amount % 10 != 0) {
				System.out.println("Amount should be in multiple of 10s.");
				return;
			}

			atmDispenser.c1.dispence(amount);

	}
}
