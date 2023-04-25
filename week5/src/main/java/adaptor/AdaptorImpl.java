package adaptor;

public class AdaptorImpl implements Adaptor{
	
	@Override
	public Voltage convert() {
		Voltage v = new Voltage();
		this.convertVolt(v,1);
		return v;
	}
	
	@Override
	public Voltage convertTo40() {
		Voltage v = new Voltage();
		this.convertVolt(v,6);
		return v;
	}

	@Override
	public Voltage convertTo120() {
		Voltage v = new Voltage();
		this.convertVolt(v,2);
		return v;
	}

	private Voltage convertVolt(Voltage v, int i) {
		return new Voltage(v.getVolt()/i);
	}
}
