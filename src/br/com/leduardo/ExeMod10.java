package br.com.leduardo;

import java.util.Scanner;

public class ExeMod10 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("Digite sua nota 1: ");
		int nota1 = s.nextInt();
		System.out.println("Digite sua nota 2: ");
		int nota2 = s.nextInt();
		System.out.println("Digite sua nota 3: ");
		int nota3 = s.nextInt();
		System.out.println("Digite sua nota 4: ");
		int nota4 = s.nextInt();
		
		double resultado = (nota1 + nota2 + nota3 + nota4) / 4.0f;
		
		if (resultado >= 7) {
			System.out.println("Você foi aprovado");
		} else if (resultado >= 5 && resultado < 7) {
			System.out.println("Você está de recuperação");
		} else {
			System.out.println("Você foi reprovado");
		}
		
		System.out.println("-------------------");
		System.out.println("Sua média foi: " + resultado);
	}

}

// ler 4 notas e dividir por 4
// Maior ou igual a 7 = Aprovado
// Maior ou igual a 5 = Recuperação
// Menor que 5 = Reprovado