package br.com.eduardo.dao.jpa;

import br.com.eduardo.dao.generic.jpa.GenericJpaDB3DAO;
import br.com.eduardo.domain.jpa.ClienteJpa2;

/**
 * @author luizeduardo
 */
public class ClienteJpaDB3DAO extends GenericJpaDB3DAO<ClienteJpa2, Long> implements IClienteJpaDAO<ClienteJpa2> {

	public ClienteJpaDB3DAO() {
		super(ClienteJpa2.class);
	}

}