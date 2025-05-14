package br.com.concessionaria.kadajo.resource;

import br.com.concessionaria.kadajo.model.Cliente;
import br.com.concessionaria.kadajo.service.ClienteService;
import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

import java.util.List;

@Path("/clientes")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class ClienteResource {

    @Inject
    ClienteService service;

    @GET
    public List<Cliente> listar() {
        return service.listarTodos();
    }

    @POST
    public Response salvar(Cliente cliente) {
        service.salvar(cliente);
        return Response.status(Response.Status.CREATED).entity(cliente).build();
    }

    @GET
    @Path("/{id}")
    public Cliente buscar(@PathParam("id") Long id) {
        return service.buscarPorId(id);
    }

    @DELETE
    @Path("/{id}")
    public Response deletar(@PathParam("id") Long id) {
        service.deletar(id);
        return Response.noContent().build();
    }
}
