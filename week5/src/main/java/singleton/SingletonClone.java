package singleton;

public class SingletonClone implements Cloneable {
	
private static final SingletonClone singleton = new SingletonClone();
	
	private SingletonClone() {};
	
	public static SingletonClone getIntance() {
	        return singleton;
	}
	
	@Override
	public SingletonClone clone() throws CloneNotSupportedException {
		 new CloneNotSupportedException();
		 return null;
	}

}
