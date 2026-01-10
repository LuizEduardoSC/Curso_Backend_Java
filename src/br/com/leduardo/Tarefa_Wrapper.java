package br.com.leduardo;

import java.util.Scanner;

public class Tarefa_Wrapper {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Digite um número inteiro: ");

		int numero = sc.nextInt();

		int numeroWrapper = Integer.valueOf(numero);

		System.out.println("Seu número inteiro é: " + numero);
		System.out.println("Seu numeroWrapper é: " + numeroWrapper);

	}

}
