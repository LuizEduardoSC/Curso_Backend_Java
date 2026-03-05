package br.com.eduardo.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.eduardo.domain.Produto;

public class ProdutoDao implements IProdutoDao {

    @Override
    public Produto cadastrar(Produto produto) {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("TarefaMod32");
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        entityManager.getTransaction().begin();
        entityManager.persist(produto);
        entityManager.getTransaction().commit();

        entityManager.close();
        entityManagerFactory.close();

        return produto;
    }

}
