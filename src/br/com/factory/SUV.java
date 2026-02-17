package br.com.factory;

public class SUV implements Car {
	@Override
	public void assemble() {
		System.out.println("Montando um SUV.");
	}
}