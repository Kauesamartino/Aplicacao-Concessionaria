package br.com.concessionaria.samartino.service;

import br.com.concessionaria.samartino.model.Carro;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.transaction.Transactional;

import java.util.List;

@ApplicationScoped
public class CarroService {

    public List<Carro> listarTodos() {
        return Carro.listAll();
    }

    public Carro buscarPorId(Long id) {
        return Carro.findById(id);
    }

    @Transactional
    public void salvar(Carro carro) {
        carro.persist();
    }

    @Transactional
    public void deletar(Long id) {
        Carro carro = Carro.findById(id);
        if (carro != null) carro.delete();
    }

    @Transactional
    public void atualizar(Long id, Carro atualizado) {
        Carro carro = Carro.findById(id);
        if (carro != null) {
            carro.modelo = atualizado.modelo;
            carro.marca = atualizado.marca;
            carro.ano = atualizado.ano;
            carro.preco = atualizado.preco;
        }
    }
}
