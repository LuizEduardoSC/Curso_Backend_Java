package br.com.leduardo;

import org.junit.Assert;
import org.junit.Test;

public class TesteClienteTest {

	@Test
	public void testeClasseCliente() {
		TesteCliente cli = new TesteCliente();
		cli.adicionarNome("Eduardo");
		cli.adicionarNome1("Eduardo");

		Assert.assertEquals("Eduardo", cli.getNome());
	}
}
