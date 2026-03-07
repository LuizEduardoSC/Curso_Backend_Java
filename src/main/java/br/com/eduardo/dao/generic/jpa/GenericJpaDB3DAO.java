package br.com.eduardo.dao.generic.jpa;

import java.io.Serializable;

import br.com.eduardo.domain.jpa.Persistente;

/**
 * @author luizeduardo
 */
public abstract class GenericJpaDB3DAO <T extends Persistente, E extends Serializable>
extends GenericJpaDAO<T,E> {

public GenericJpaDB3DAO(Class<T> persistenteClass) {
	super(persistenteClass, "Mysql1");
}

}
