package br.com.eduardo.dao.jpa;

import br.com.eduardo.dao.generic.jpa.GenericJpaDB1DAO;
import br.com.eduardo.domain.jpa.ClienteJpa;

/**
 * @author luizeduardo
 *
 */
public class ClienteJpaDAO extends GenericJpaDB1DAO<ClienteJpa, Long> implements IClienteJpaDAO<ClienteJpa> {

	public ClienteJpaDAO() {
		super(ClienteJpa.class);
	}

}
