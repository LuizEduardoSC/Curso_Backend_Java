package br.com.eduardo.dao.jpa;

import br.com.eduardo.dao.generic.jpa.GenericJpaDB1DAO;
import br.com.eduardo.domain.jpa.ProdutoJpa;

/**
 * @author luizeduardo
 *
 */
public class ProdutoJpaDAO extends GenericJpaDB1DAO<ProdutoJpa, Long> implements IProdutoJpaDAO {

	public ProdutoJpaDAO() {
		super(ProdutoJpa.class);
	}

}
