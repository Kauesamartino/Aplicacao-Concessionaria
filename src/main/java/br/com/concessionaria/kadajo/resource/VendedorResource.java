package br.com.concessionaria.kadajo.resource;

import br.com.concessionaria.kadajo.model.Vendedor;
import br.com.concessionaria.kadajo.service.VendedorService;
import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

import java.util.List;

@Path("/vendedores")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class VendedorResource {

    @Inject
    VendedorService service;

    @GET
    public List<Vendedor> listar() {
        return service.listarTodos();
    }

    @POST
    public Response salvar(Vendedor vendedor) {
        service.salvar(vendedor);
        return Response.status(Response.Status.CREATED).entity(vendedor).build();
    }

    @GET
    @Path("/{id}")
    public Vendedor buscar(@PathParam("id") Long id) {
        return service.buscarPorId(id);
    }

    @DELETE
    @Path("/{id}")
    public Response deletar(@PathParam("id") Long id) {
        service.deletar(id);
        return Response.noContent().build();
    }
}
