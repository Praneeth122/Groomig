package chainofresponsibility;

public class Doller100Dispenser implements DispenseChain {
	
	private DispenseChain chain;
	
	@Override
	public void setNextChain(DispenseChain nextChain) {
		this.chain=nextChain;
	}

	@Override
	public void dispence(int amount) {
		if(amount>= 100){
			int num = amount/100;
			int remainder = amount % 100;
			System.out.println("Dispensing "+num+" 100$ note");
			if(remainder !=0) this.chain.dispence(remainder);
		}else{
			this.chain.dispence(amount);
		}
		
	}

}
