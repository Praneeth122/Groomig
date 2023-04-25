package adaptor;

public interface Adaptor {
	public Voltage convert();
	
	public Voltage convertTo40();
	
	public Voltage convertTo120();
}
