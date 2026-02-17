package br.com.factory;

public class SedanFactory implements CarFactory {
	@Override
	public Car createCar() {
		return new Sedan();
	}
}