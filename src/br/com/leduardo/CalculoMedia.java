package br.com.leduardo;

public class CalculoMedia {

	public static void main(String[] args) {
		calculoMedia();

	}

	public static void calculoMedia() {
		System.out.println("**** calculoMedia ****");
		
		int nota1 = 10;
		int nota2 = 9;
		int nota3 = 8;
		int nota4 = 7;
		
		float media = (nota1 + nota2 + nota3 + nota4) / 4.0f;
		System.out.println("Sua média é de: " + media);
	}

}
