package br.com.concessionaria.kadajo.model;

import io.quarkus.hibernate.orm.panache.PanacheEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "Vendedor")
public class Vendedor extends PanacheEntity {

    @Column(name = "nome", nullable = false, length = 100)
    public String nome;

    @Column(name = "matricula", nullable = false, unique = true, length = 20)
    public String matricula;

    @Column(name = "telefone", length = 20)
    public String telefone;

    @Column(name = "email", length = 100)
    public String email;
}
