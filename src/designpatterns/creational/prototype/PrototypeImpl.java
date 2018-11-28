package designpatterns.creational.prototype;

public class PrototypeImpl implements IPrototype, Cloneable{

	@Override
	public Object reproduce() throws CloneNotSupportedException{
		 Object obj = this.clone();
		 return obj; 
	}
}
