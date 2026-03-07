package br.com.eduardo.dao.jpa;

import br.com.eduardo.dao.generic.jpa.IGenericJapDAO;
import br.com.eduardo.domain.jpa.Persistente;

/**
 * @author luizeduardo
 *
 */
public interface IClienteJpaDAO<T extends Persistente> extends IGenericJapDAO<T, Long> {

}
