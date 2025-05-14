package br.com.concessionaria.kadajo.model;

import io.quarkus.hibernate.orm.panache.PanacheEntity;
import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "Venda")
public class Venda extends PanacheEntity {

    @ManyToOne
    @JoinColumn(name = "cliente_id", nullable = false)
    public Cliente cliente;

    @ManyToOne
    @JoinColumn(name = "vendedor_id", nullable = false)
    public Vendedor vendedor;

    @Column(name = "veiculo", nullable = false, length = 100)
    public String veiculo;

    @Column(name = "valor", nullable = false)
    public double valor;

    @Column(name = "data_venda", nullable = false)
    public LocalDate dataVenda;
}
