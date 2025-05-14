package br.com.concessionaria.kadajo.resource;

import br.com.concessionaria.kadajo.model.Venda;
import br.com.concessionaria.kadajo.service.VendaService;
import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

import java.util.List;

@Path("/vendas")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class VendaResource {

    @Inject
    VendaService service;

    @GET
    public List<Venda> listar() {
        return service.listarTodas();
    }

    @POST
    public Response salvar(Venda venda) {
        service.salvar(venda);
        return Response.status(Response.Status.CREATED).entity(venda).build();
    }

    @GET
    @Path("/{id}")
    public Venda buscar(@PathParam("id") Long id) {
        return service.buscarPorId(id);
    }

    @DELETE
    @Path("/{id}")
    public Response deletar(@PathParam("id") Long id) {
        service.deletar(id);
        return Response.noContent().build();
    }
}
