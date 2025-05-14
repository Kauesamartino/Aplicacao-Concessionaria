package br.com.concessionaria.kadajo.model;

import io.quarkus.hibernate.orm.panache.PanacheEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "CLIENTE")
public class Cliente extends PanacheEntity {

    @Column(name = "NOME", nullable = false, length = 100)
    public String nome;

    @Column(name = "CPF", nullable = false, unique = true, length = 14)
    public String cpf;

    @Column(name = "TELEFONE", length = 20)
    public String telefone;

    @Column(name = "EMAIL", length = 100)
    public String email;
}
