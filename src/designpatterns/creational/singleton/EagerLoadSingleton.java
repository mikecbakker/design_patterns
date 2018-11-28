package designpatterns.creational.singleton;

public class EagerLoadSingleton implements ISingleton{

	protected static ISingleton instance = new EagerLoadSingleton();

	// Prevent instantiation
	private EagerLoadSingleton() {

	}

	@Override
	public ISingleton getInstance() {
		return instance;
	}
}
