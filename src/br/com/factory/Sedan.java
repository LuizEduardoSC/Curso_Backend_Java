package br.com.factory;

public class Sedan implements Car {
	@Override
	public void assemble() {
		System.out.println("Montando um Sedan.");
	}
}