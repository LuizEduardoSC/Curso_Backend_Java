package br.com.eduardo.tarefamodulo40;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.persistence.autoconfigure.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import br.com.eduardo.domain.Cliente;
import br.com.eduardo.repository.IClienteRepository;

@SpringBootApplication
@EnableJpaRepositories(basePackages = "br.com.eduardo.repository")
@EntityScan(basePackages = "br.com.eduardo.domain")
@ComponentScan(basePackages = {
    "br.com.eduardo.tarefamodulo40", // Escaneia a própria aplicação
    "br.com.eduardo.controller"      // Escaneia o pacote do Controller
})
public class TarefaModulo40Application {

	public static void main(String[] args) {
		SpringApplication.run(TarefaModulo40Application.class, args);
	}
	
	@Bean
	public CommandLineRunner run(IClienteRepository repo) {
		return args -> {
			if (repo.count() == 0) {
				Cliente c = Cliente.builder()
					.nome("Eduardo")
					.cpf(11122233344L)
					.tel(12912345678L)
					.email("contato@eduardo.com")
					.end("Avenida Principal")
					.numero(500)
					.cidade("SJC")
					.estado("SP")
					.build();
				repo.save(c);
				System.out.println(">>> Cliente de teste inserido com sucesso!");
			}
		};
	}
}