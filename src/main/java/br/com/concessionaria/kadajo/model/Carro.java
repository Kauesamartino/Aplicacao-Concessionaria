package br.com.concessionaria.kadajo.model;

import io.quarkus.hibernate.orm.panache.PanacheEntity;
import jakarta.persistence.Entity;

@Entity
public class Carro extends PanacheEntity {
    public String modelo;
    public String marca;
    public int ano;
    public double preco;
}
