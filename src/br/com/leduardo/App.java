package br.com.leduardo;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        // Lista genérica que aceita qualquer tipo de Carro
        List<Carro> listaDeCarros = new ArrayList<>();

        // Adicionando diferentes tipos de carros
        listaDeCarros.add(new Sedan("Honda Civic"));
        listaDeCarros.add(new SUV("Toyota Hilux"));

        // Percorrendo a lista
        for (Carro carro : listaDeCarros) {
            carro.exibirInfo();
            carro.ligar();
            carro.desligar();
        }
    }
}
