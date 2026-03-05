package br.com.eduardo;

import br.com.eduardo.dao.IProdutoDao;
import br.com.eduardo.dao.ProdutoDao;

import br.com.eduardo.domain.Produto;

public class Main {
    public static void main(String[] args) {
        IProdutoDao produtoDao = new ProdutoDao();

        Produto p = new Produto();
        p.setCodigo("P1");
        p.setNome("Produto Teste");
        p.setDescricao("Descricao de teste");

        p = produtoDao.cadastrar(p);

        System.out.println("Produto salvo com ID: " + p.getId());
    }
}
