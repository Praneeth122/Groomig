package singleton;

public class SingletonSync {
private static SingletonSync singleton;
	
	private SingletonSync() {};
	
	public static SingletonSync getIntance() {
		 if (singleton == null) {
	            synchronized (Singleton.class) {
	                if (singleton == null) {
	                    singleton = new SingletonSync();
	                }
	            }
	        }
	        return singleton;
	}
}
