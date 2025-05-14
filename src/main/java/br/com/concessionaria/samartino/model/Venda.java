package br.com.concessionaria.samartino.model;

import io.quarkus.hibernate.orm.panache.PanacheEntity;
import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
public class Venda extends PanacheEntity {

    @ManyToOne
    public Cliente cliente;

    @ManyToOne
    public Vendedor vendedor;

    public String veiculo;
    public double valor;
    public LocalDate dataVenda;
}