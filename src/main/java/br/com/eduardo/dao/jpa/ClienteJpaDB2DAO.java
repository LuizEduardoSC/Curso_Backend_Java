package br.com.eduardo.dao.jpa;

import br.com.eduardo.dao.generic.jpa.GenericJpaDB2DAO;
import br.com.eduardo.domain.jpa.ClienteJpa;

/**
 * @author luizeduardo
 */
public class ClienteJpaDB2DAO extends GenericJpaDB2DAO<ClienteJpa, Long> implements IClienteJpaDAO<ClienteJpa> {

	public ClienteJpaDB2DAO() {
		super(ClienteJpa.class);
	}

}
