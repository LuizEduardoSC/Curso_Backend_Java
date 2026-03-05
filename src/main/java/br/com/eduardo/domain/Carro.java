package br.com.eduardo.domain;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "tb_carro")
public class Carro {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "carro_seq")
    @SequenceGenerator(name = "carro_seq", sequenceName = "sq_carro", initialValue = 1, allocationSize = 1)
    private Long id;

    @Column(name = "modelo", length = 50, nullable = false)
    private String modelo;

    // Many To One -> Vários carros pertencem a uma marca
    @ManyToOne(cascade = { CascadeType.PERSIST, CascadeType.MERGE })
    @JoinColumn(name = "marca_id_fk", referencedColumnName = "id", nullable = false)
    private Marca marca;

    // Many To Many -> Vários carros possuem vários acessórios e um acessório pode
    // estar em vários carros
    @ManyToMany(cascade = { CascadeType.PERSIST, CascadeType.MERGE })
    @JoinTable(name = "tb_carro_acessorio", joinColumns = @JoinColumn(name = "carro_id"), inverseJoinColumns = @JoinColumn(name = "acessorio_id"))
    private List<Acessorio> acessorios;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Marca getMarca() {
        return marca;
    }

    public void setMarca(Marca marca) {
        this.marca = marca;
    }

    public List<Acessorio> getAcessorios() {
        return acessorios;
    }

    public void setAcessorios(List<Acessorio> acessorios) {
        this.acessorios = acessorios;
    }
}
