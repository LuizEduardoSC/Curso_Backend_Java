package br.com.leduardo.testes;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import br.com.leduardo.Pessoa;

public class ListaMulheresTeste {

	@Test
	void deveConterSomenteMulheres() {
		// Entrada igual ao App
		String entrada = "Ana-F,João-M,Maria-F,Carlos-M,Julia-F";

		// Criar lista de pessoas (mesma lógica do App)
		List<Pessoa> pessoas = Arrays.stream(entrada.split(",")).map(item -> {
			String[] dados = item.split("-");
			return new Pessoa(dados[0], dados[1]);
		}).collect(Collectors.toList());

		// Filtrar apenas mulheres
		List<Pessoa> mulheres = pessoas.stream().filter(p -> p.getSexo().equalsIgnoreCase("F"))
				.collect(Collectors.toList());

		// Verificar se todas são mulheres
		boolean apenasMulheres = mulheres.stream().allMatch(p -> p.getSexo().equalsIgnoreCase("F"));

		assertTrue(apenasMulheres, "A lista contém algum nome que não é feminino.");
	}
}