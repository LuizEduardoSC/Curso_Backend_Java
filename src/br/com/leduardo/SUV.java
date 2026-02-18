package br.com.leduardo;

public class SUV extends Carro {

	public SUV(String modelo) {
		super(modelo);
	}

	@Override
	public void exibirInfo() {
		System.out.println("SUV - Modelo: " + getModelo());
	}
}
