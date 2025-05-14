package br.com.concessionaria.kadajo.model;

import io.quarkus.hibernate.orm.panache.PanacheEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "CARRO")
public class Carro extends PanacheEntity {

    @Column(name = "MODELO", nullable = false, length = 100)
    public String modelo;

    @Column(name = "MARCA", nullable = false, length = 100)
    public String marca;

    @Column(name = "ANO", nullable = false)
    public int ano;

    @Column(name = "PRECO", nullable = false)
    public double preco;
}
