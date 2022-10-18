package javaOOP.abstraction;

public interface IAnimal {

	public String getName();

	void setName(String name);

	abstract String getAddress();

	abstract void setAddress(String address);
}
