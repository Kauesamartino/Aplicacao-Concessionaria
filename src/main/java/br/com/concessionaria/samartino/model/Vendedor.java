package br.com.concessionaria.samartino.model;

import io.quarkus.hibernate.orm.panache.PanacheEntity;
import jakarta.persistence.Entity;

@Entity
public class Vendedor extends PanacheEntity {
    public String nome;
    public String matricula;
    public String telefone;
    public String email;
}
