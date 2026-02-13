package br.com.leduardo;

//Classe concreta PessoaFisica
public class PessoaFisica extends Pessoa {
    private String cpf;

    public PessoaFisica(String nome, String cpf) {
        super(nome);
        this.cpf = cpf;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    @Override
    public void mostrarDados() {
        System.out.println("Pessoa Física: " + getNome() + " | CPF: " + cpf);
    }
}