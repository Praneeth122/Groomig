package chainofresponsibility;

public class Doller50Dispenser implements DispenseChain{
	
	private DispenseChain chain;
	
	@Override
	public void setNextChain(DispenseChain nextChain) {
		this.chain=nextChain;
	}

	@Override
	public void dispence(int amount) {
		if(amount>= 50){
			int num = amount/50;
			int remainder = amount % 50;
			System.out.println("Dispensing "+num+" 50$ note");
			if(remainder !=0) this.chain.dispence(remainder);
		}else{
			this.chain.dispence(amount);
		}
		
	}
}
