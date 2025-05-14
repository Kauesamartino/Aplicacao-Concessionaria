package br.com.concessionaria.samartino.model;

import io.quarkus.hibernate.orm.panache.PanacheEntity;
import jakarta.persistence.Entity;

@Entity
public class Cliente extends PanacheEntity {
    public String nome;
    public String cpf;
    public String telefone;
    public String email;
}
