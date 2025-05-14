package br.com.concessionaria.kadajo.model;

import io.quarkus.hibernate.orm.panache.PanacheEntity;
import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "VENDA")
public class Venda extends PanacheEntity {

    @ManyToOne
    @JoinColumn(name = "CLIENTE_ID", nullable = false)
    public Cliente cliente;

    @ManyToOne
    @JoinColumn(name = "VENDEDOR_ID", nullable = false)
    public Vendedor vendedor;

    @Column(name = "VEICULO", nullable = false, length = 100)
    public String veiculo;

    @Column(name = "VALOR", nullable = false)
    public double valor;

    @Column(name = "DATA_VENDA", nullable = false)
    public LocalDate dataVenda;
}
