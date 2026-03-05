package br.com.eduardo;

import static org.junit.Assert.assertNotNull;

import br.com.eduardo.dao.IProdutoDao;
import br.com.eduardo.dao.ProdutoDao;

import org.junit.Test;

import br.com.eduardo.domain.Produto;

public class ProdutoTest {

    private IProdutoDao produtoDao;

    public ProdutoTest() {
        produtoDao = new ProdutoDao();
    }

    @Test
    public void cadastrar() {
        Produto produto = new Produto();
        produto.setCodigo("A" + java.util.UUID.randomUUID().toString().substring(0, 8));
        produto.setNome("Produto Teste");
        produto.setDescricao("Descricao do Produto");

        produto = produtoDao.cadastrar(produto);

        assertNotNull(produto);
        assertNotNull(produto.getId());
    }
}
