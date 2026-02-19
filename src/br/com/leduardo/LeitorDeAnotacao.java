package br.com.leduardo;

public class LeitorDeAnotacao {
    public static void main(String[] args) {
        // Obtém a classe
        Class<?> clazz = Cliente.class;

        // Verifica se a anotação está presente
        if (clazz.isAnnotationPresent(Tabela.class)) {
            // Recupera a anotação
            Tabela tabela = clazz.getAnnotation(Tabela.class);

            // Imprime o valor da anotação
            System.out.println("Nome da tabela: " + tabela.value());
        } else {
            System.out.println("A anotação @Tabela não está presente na classe.");
        }
    }
}
