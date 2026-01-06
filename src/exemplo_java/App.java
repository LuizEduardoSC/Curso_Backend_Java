package exemplo_java;

public class App {
    public static void main(String[] args) {
        // Criando um objeto Carro
        Carro carro = new Carro("Fiat", "Uno", 2010, "Vermelho");

        // Testando os métodos
        carro.exibirStatus();   // Mostra o estado inicial
        carro.ligar();          // Liga o motor
        carro.exibirStatus();   // Mostra o estado após ligar
    }
}