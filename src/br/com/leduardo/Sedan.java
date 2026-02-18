package br.com.leduardo;

public class Sedan extends Carro {

	public Sedan(String modelo) {
		super(modelo);
	}

	@Override
	public void exibirInfo() {
		System.out.println("Sedan - Modelo: " + getModelo());
	}
}
