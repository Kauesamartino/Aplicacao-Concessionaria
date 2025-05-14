package br.com.concessionaria.kadajo.service;

import br.com.concessionaria.kadajo.model.Venda;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.transaction.Transactional;

import java.util.List;

@ApplicationScoped
public class VendaService {

    public List<Venda> listarTodas() {
        return Venda.listAll();
    }

    public Venda buscarPorId(Long id) {
        return Venda.findById(id);
    }

    @Transactional
    public void salvar(Venda venda) {
        venda.persist();
    }

    @Transactional
    public void deletar(Long id) {
        Venda venda = Venda.findById(id);
        if (venda != null) venda.delete();
    }
}
