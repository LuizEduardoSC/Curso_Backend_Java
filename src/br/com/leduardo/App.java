package br.com.leduardo;

import java.util.*;
import java.util.stream.Collectors;

public class App {
	public static void main(String[] args) {
		// Lista de entrada simulada
		String entrada = "Ana-F,João-M,Maria-F,Carlos-M,Julia-F";

		// Separar por vírgula e criar objetos Pessoa
		List<Pessoa> pessoas = Arrays.stream(entrada.split(",")).map(item -> {
			String[] dados = item.split("-");
			return new Pessoa(dados[0], dados[1]);
		}).collect(Collectors.toList());

		// Filtrar apenas mulheres usando lambda
		List<Pessoa> mulheres = pessoas.stream().filter(p -> {
			if (p.getSexo().equalsIgnoreCase("F")) {
				return true;
			} else {
				return false;
			}
		}).collect(Collectors.toList());

		// Exibir no console
		System.out.println("Lista de mulheres:");
		mulheres.forEach(p -> System.out.println(p.getNome()));
	}
}
