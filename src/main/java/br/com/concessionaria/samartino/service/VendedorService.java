package br.com.concessionaria.samartino.service;

import br.com.concessionaria.samartino.model.Vendedor;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.transaction.Transactional;

import java.util.List;

@ApplicationScoped
public class VendedorService {

    public List<Vendedor> listarTodos() {
        return Vendedor.listAll();
    }

    public Vendedor buscarPorId(Long id) {
        return Vendedor.findById(id);
    }

    @Transactional
    public void salvar(Vendedor vendedor) {
        vendedor.persist();
    }

    @Transactional
    public void deletar(Long id) {
        Vendedor vendedor = Vendedor.findById(id);
        if (vendedor != null) vendedor.delete();
    }
}
