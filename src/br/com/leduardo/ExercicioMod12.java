package br.com.leduardo;

import java.util.*;

public class ExercicioMod12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\n === MENU ===");
            System.out.println("1 - Ordenar nomes (Parte 1)");
            System.out.println("2 - Separar nomes por sexo (Parte 2)");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine(); // consumir quebra de linha

            switch (opcao) {
                case 1:
                    parte1(scanner);
                    break;
                case 2:
                    parte2(scanner);
                    break;
                case 0:
                    System.out.println("Encerrando programa...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        } while (opcao != 0);

        scanner.close();
    }

    // Parte 1 – Ler nomes, ordenar e imprimir
    public static void parte1(Scanner scanner) {
        System.out.println("Digite nomes separados por vírgula:");
        String entrada = scanner.nextLine();

        String[] nomes = entrada.split(",");
        for (int i = 0; i < nomes.length; i++) {
            nomes[i] = nomes[i].trim();
        }

        Arrays.sort(nomes);

        System.out.println("\n Nomes em ordem alfabética:");
        for (String nome : nomes) {
            System.out.println(nome);
        }
    }

    // Parte 2 – Ler nomes e sexo, separar em grupos
    public static void parte2(Scanner scanner) {
        System.out.println("Digite nomes e sexo no formato Nome-M, Nome-F,...");
        String entrada = scanner.nextLine();

        String[] pessoas = entrada.split(",");
        List<String> masculino = new ArrayList<>();
        List<String> feminino = new ArrayList<>();

        for (String pessoa : pessoas) {
            String[] partes = pessoa.split("-");
            if (partes.length == 2) {
                String nome = partes[0].trim();
                String sexo = partes[1].trim().toUpperCase();

                if (sexo.equals("M")) {
                    masculino.add(nome);
                } else if (sexo.equals("F")) {
                    feminino.add(nome);
                } else {
                    System.out.println("Sexo inválido para: " + pessoa);
                }
            } else {
                System.out.println("Formato inválido para: " + pessoa);
            }
        }

        Collections.sort(masculino);
        Collections.sort(feminino);

        System.out.println("\nGrupo Masculino:");
        for (String nome : masculino) {
            System.out.println(nome);
        }

        System.out.println("\nGrupo Feminino:");
        for (String nome : feminino) {
            System.out.println(nome);
        }
    }
}