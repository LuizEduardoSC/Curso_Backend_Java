package br.com.leduardo;

//Classe abstrata que implementa a interface Veiculo
public abstract class Carro implements Veiculo {
	private String modelo;

	public Carro(String modelo) {
		this.modelo = modelo;
	}

	public String getModelo() {
		return modelo;
	}

	// Método abstrato que cada carro deve implementar
	public abstract void exibirInfo();

	// Implementações padrão da interface
	@Override
	public void ligar() {
		System.out.println(getModelo() + " está ligado.");
	}

	@Override
	public void desligar() {
		System.out.println(getModelo() + " está desligado.");
	}
}
