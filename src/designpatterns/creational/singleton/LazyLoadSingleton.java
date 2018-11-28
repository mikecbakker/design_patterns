package designpatterns.creational.singleton;

public class LazyLoadSingleton implements ISingleton{

	protected static ISingleton instance = null;

	// Prevent instantiation
	private LazyLoadSingleton() {

	}

	/*
	 * Lazy load get instance.
	 */
	@Override
	public ISingleton getInstance() {
		if(instance == null) {
			instance = new LazyLoadSingleton();
		}
		return instance;
	}
}
