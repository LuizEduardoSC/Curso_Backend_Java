package br.com.eduardo;

import br.com.eduardo.dao.CarroDao;
import br.com.eduardo.dao.ICarroDao;
import br.com.eduardo.domain.Acessorio;
import br.com.eduardo.domain.Carro;
import br.com.eduardo.domain.Marca;
import org.junit.BeforeClass;
import org.junit.Test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertNotNull;

public class CarroTest {

    private ICarroDao carroDao;

    public CarroTest() {
        carroDao = new CarroDao();
    }

    @BeforeClass
    public static void prepareDatabase() {
        try {
            Connection conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres", "postgres",
                    "1234");
            Statement stmt = conn.createStatement();
            // Create database if not exists
            stmt.executeUpdate("CREATE DATABASE tarefa_mod_33");
            System.out.println("Database tarefa_mod_33 created.");
        } catch (Exception e) {
            System.out.println("Database likely already exists: " + e.getMessage());
        }
    }

    @Test
    public void cadastrar() {
        Carro carro = new Carro();
        carro.setModelo("Civic");

        Marca marca = new Marca();
        marca.setNome("Honda");
        carro.setMarca(marca);

        Acessorio ac1 = new Acessorio();
        ac1.setNome("Ar Condicionado");

        Acessorio ac2 = new Acessorio();
        ac2.setNome("Bancos de Couro");

        List<Acessorio> acessorios = new ArrayList<>();
        acessorios.add(ac1);
        acessorios.add(ac2);

        carro.setAcessorios(acessorios);

        ac1.setCarros(new ArrayList<>(List.of(carro)));
        ac2.setCarros(new ArrayList<>(List.of(carro)));

        Carro carroCadastrado = carroDao.cadastrar(carro);

        assertNotNull(carroCadastrado);
        assertNotNull(carroCadastrado.getId());
        assertNotNull(carroCadastrado.getMarca().getId());
        assertNotNull(carroCadastrado.getAcessorios().get(0).getId());
    }
}
