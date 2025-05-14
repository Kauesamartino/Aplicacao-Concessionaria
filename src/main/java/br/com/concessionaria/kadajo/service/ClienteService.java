package br.com.concessionaria.kadajo.service;

import br.com.concessionaria.kadajo.model.Cliente;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.transaction.Transactional;

import java.util.List;

@ApplicationScoped
public class ClienteService {

    public List<Cliente> listarTodos() {
        return Cliente.listAll();
    }

    public Cliente buscarPorId(Long id) {
        return Cliente.findById(id);
    }

    @Transactional
    public void salvar(Cliente cliente) {
        cliente.persist();
    }

    @Transactional
    public void deletar(Long id) {
        Cliente cliente = Cliente.findById(id);
        if (cliente != null) cliente.delete();
    }
}

