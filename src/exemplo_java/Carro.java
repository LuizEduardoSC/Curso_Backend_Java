package exemplo_java;

/**
 * Representa um Carro, um objeto comum do mundo real.
 * Esta classe encapsula as propriedades (estado) e comportamentos (métodos)
 * típicos de um veículo automotivo simples.
 */
public class Carro {

    // --- Propriedades (Atributos do Objeto) ---
    private String marca;
    private String modelo;
    private int ano;
    private String cor;
    private boolean motorLigado;
    private double velocidadeAtual;

    /**
     * Construtor para criar uma nova instância de Carro.
     * 
     * @param marca A fabricante do carro.
     * @param modelo O modelo específico do carro.
     * @param ano O ano de fabricação.
     * @param cor A cor do carro.
     */
    public Carro(String marca, String modelo, int ano, String cor) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.cor = cor;
        this.motorLigado = false;   // Começa desligado
        this.velocidadeAtual = 0.0; // Começa parado
    }

    // --- Pequenos Métodos (Comportamentos) ---

    /** Liga o motor do carro se ele estiver desligado. */
    public void ligar() {
        if (!motorLigado) {
            motorLigado = true;
            System.out.println("Vrummm! O motor do " + modelo + " ligou.");
        } else {
            System.out.println("O motor já está ligado.");
        }
    }

    /** Método simples para exibir o estado atual do carro. */
    public void exibirStatus() {
        String statusMotor = motorLigado ? "Ligado" : "Desligado";
        System.out.println("--- Status do Carro ---");
        System.out.println("Veículo: " + marca + " " + modelo + " (" + cor + ")");
        System.out.println("Motor: " + statusMotor);
        System.out.println("Velocidade: " + velocidadeAtual + " km/h");
        System.out.println("-----------------------");
    }
}