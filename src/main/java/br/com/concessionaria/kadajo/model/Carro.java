package br.com.concessionaria.kadajo.model;

import io.quarkus.hibernate.orm.panache.PanacheEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "Carro")
public class Carro extends PanacheEntity {

    @Column(name = "modelo", nullable = false, length = 100)
    public String modelo;

    @Column(name = "marca", nullable = false, length = 100)
    public String marca;

    @Column(name = "ano", nullable = false)
    public int ano;

    @Column(name = "preco", nullable = false)
    public double preco;
}
