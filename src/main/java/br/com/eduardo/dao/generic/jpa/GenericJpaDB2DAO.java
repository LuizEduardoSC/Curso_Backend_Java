package br.com.eduardo.dao.generic.jpa;

import java.io.Serializable;

import br.com.eduardo.domain.jpa.Persistente;

/**
 * @author luizeduardo
 */
public abstract class GenericJpaDB2DAO<T extends Persistente, E extends Serializable> extends GenericJpaDAO<T, E> {

	public GenericJpaDB2DAO(Class<T> persistenteClass) {
		super(persistenteClass, "Postgre2");
	}

}
