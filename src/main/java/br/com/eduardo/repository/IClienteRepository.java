/**
 * @author Eduardo
 */
package br.com.eduardo.repository;

import br.com.eduardo.domain.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IClienteRepository extends JpaRepository<Cliente, Long> {
}
