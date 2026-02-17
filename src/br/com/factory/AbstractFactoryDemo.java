package br.com.factory;

public class AbstractFactoryDemo {
	public static void main(String[] args) {
		// Fábrica de Sedan
		CarFactory sedanFactory = new SedanFactory();
		Car sedan = sedanFactory.createCar();
		sedan.assemble();

		// Fábrica de SUV
		CarFactory suvFactory = new SUVFactory();
		Car suv = suvFactory.createCar();
		suv.assemble();
	}
}