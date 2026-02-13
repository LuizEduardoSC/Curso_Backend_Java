package br.com.leduardo;

//Classe principal para testar
public class Programa {
    public static void main(String[] args) {
        PessoaFisica pf = new PessoaFisica("Eduardo", "123.456.789-00");
        PessoaJuridica pj = new PessoaJuridica("Empresa XYZ", "12.345.678/0001-99");

        pf.mostrarDados();
        pj.mostrarDados();
    }
}