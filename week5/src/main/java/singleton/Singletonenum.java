package singleton;

public enum Singletonenum {
	
	singletonenum;
	
	int value;
	
	public Singletonenum getIntance() {
		return singletonenum;
	}
	
	public int getValue() {
		return this.value;
	}
	
	public void setValue(int value) {
		this.value = value;
	}
}
