package br.com.leduardo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ExercicioColecoes {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<String> grupoMasculino = new ArrayList<>();
        List<String> grupoFeminino = new ArrayList<>();

        System.out.print("Quantas pessoas deseja cadastrar? ");
        int qtd = sc.nextInt();
        sc.nextLine(); // consumir quebra de linha

        for (int i = 0; i < qtd; i++) {
            System.out.println("\nPessoa " + (i + 1));

            System.out.print("Digite o nome: ");
            String nome = sc.nextLine();

            System.out.print("Digite o sexo (M/F): ");
            String sexo = sc.nextLine().trim().toUpperCase();

            if (sexo.equals("M")) {
                grupoMasculino.add(nome);
            } else if (sexo.equals("F")) {
                grupoFeminino.add(nome);
            } else {
                System.out.println("Sexo inválido! Não foi possível cadastrar.");
            }
        }

        System.out.println("\n--- Resultado ---");
        System.out.println("Grupo Masculino: " + grupoMasculino);
        System.out.println("Grupo Feminino: " + grupoFeminino);

        sc.close();
    }
}