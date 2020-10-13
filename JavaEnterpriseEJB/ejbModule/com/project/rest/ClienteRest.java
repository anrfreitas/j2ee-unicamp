package com.project.rest;


import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

import com.project.entities.Cliente;
import com.project.managers.ClienteManager;

@Path("/cliente")
@Stateless
public class ClienteRest {

	@Inject 
	ClienteManager manager;
	
	/* How to create Rest Functions to the EJB Project we'll do in another video! */
	
	/* It works perfectly, but we should before add JaxRS Facet to the JavaEnterpriseWeb project */
	
	@GET
	@Path("/teste")
	@Produces("application/json")
	public String teste() {
		return "Teste OK";
	}
	
	@GET
	@Path("/obter/{id}")
	@Produces("application/json")
	public Cliente getCliente(@PathParam("id") long id) {
		return manager.get(id);
	}
	
	@GET
	@Path("/todos")
	@Produces("application/json")
	public List<Cliente> getClientes() {
		return manager.get();
	}
	
	@POST
	@Path("/salvar")
	@Consumes("application/json")
	public void saveCliente(Cliente cliente) {
		manager.save(cliente);
	}
	
	@PUT
	@Path("/atualizar")
	@Consumes("application/json")
	public void updateCliente(Cliente cliente) {
		manager.update(cliente);
	}
	
	@DELETE
	@Path("/remover/{id}")
	@Consumes("application/json")
	public void deleteCliente(@PathParam("id") long id) {
		/* There's no method for deletion by id, lets create it now! */
		manager.removeById(id);
	}
	
	/* I called the wrong method in Postman, should be POST instead GET 
	 * Thats all! We tested all the functions GET, POST, PUT, DELETE */
	
	
}
