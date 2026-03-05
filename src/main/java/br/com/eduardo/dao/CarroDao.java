package br.com.eduardo.dao;

import br.com.eduardo.domain.Carro;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class CarroDao implements ICarroDao {

    @Override
    public Carro cadastrar(Carro carro) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("ExercicioMod33");
        EntityManager em = emf.createEntityManager();

        em.getTransaction().begin();
        em.persist(carro);
        em.getTransaction().commit();

        em.close();
        emf.close();
        return carro;
    }
}
