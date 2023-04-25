package chainofresponsibility;

public interface DispenseChain {
	public void setNextChain(DispenseChain nextChain);
	public void dispence(int amount);
}
