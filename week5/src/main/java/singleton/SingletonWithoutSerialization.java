package singleton;

public class SingletonWithoutSerialization {
	
	public static final SingletonWithoutSerialization singelton = new SingletonWithoutSerialization();

    private SingletonWithoutSerialization() {
    }

    protected SingletonWithoutSerialization readResolve() {
        return singelton;
    }
}
