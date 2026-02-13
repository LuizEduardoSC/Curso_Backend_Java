package br.com.leduardo;

//Classe concreta PessoaJuridica
public class PessoaJuridica extends Pessoa {
    private String cnpj;

    public PessoaJuridica(String nome, String cnpj) {
        super(nome);
        this.cnpj = cnpj;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    @Override
    public void mostrarDados() {
        System.out.println("Pessoa Jurídica: " + getNome() + " | CNPJ: " + cnpj);
    }
}