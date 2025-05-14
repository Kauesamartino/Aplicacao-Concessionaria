package br.com.concessionaria.kadajo.resource;

import br.com.concessionaria.kadajo.model.Carro;
import br.com.concessionaria.kadajo.service.CarroService;
import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

import java.util.List;

@Path("/carros")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class CarroResource {

    @Inject
    CarroService service;

    @GET
    public List<Carro> listar() {
        return service.listarTodos();
    }

    @GET
    @Path("/{id}")
    public Carro buscar(@PathParam("id") Long id) {
        Carro carro = service.buscarPorId(id);
        if (carro == null) {
            throw new NotFoundException("Carro com ID " + id + " não encontrado.");
        }
        return carro;
    }

    @POST
    public Response salvar(Carro carro) {
        service.salvar(carro);
        return Response.status(Response.Status.CREATED).entity(carro).build();
    }

    @PUT
    @Path("/{id}")
    public Response atualizar(@PathParam("id") Long id, Carro atualizado) {
        service.atualizar(id, atualizado);
        return Response.ok().build();
    }

    @DELETE
    @Path("/{id}")
    public Response deletar(@PathParam("id") Long id) {
        service.deletar(id);
        return Response.noContent().build();
    }
}
