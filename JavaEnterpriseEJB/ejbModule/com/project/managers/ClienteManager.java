package com.project.managers;

import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.persistence.EntityManager;

import com.project.entities.Cliente;

@Stateless /* Since we are not using beans context, we must use EJB Context to propagate the EntityManager Factory!  */
public class ClienteManager {

	@Inject
	private EntityManager em;
	
	public Cliente get(long id) {
		return em.find(Cliente.class, id);
	}
	
	@SuppressWarnings("unchecked")
	public List<Cliente> get() {
		return em.createQuery("SELECT c FROM Cliente c").getResultList();
	}
	
	public void save(Cliente entity) {
		em.persist(entity);
	}
	
	public void update(Cliente entity) {
		if(entity.getId() != 0)
			em.merge(entity);
		else
			em.persist(entity);
	}
	
	public void remove(Cliente entity) {
		em.remove(entity);
	}
	
	public void removeById(long id) {
		remove(get(id));
	}
	
	/* Thats all folks! If you need to take a look at the xHTML source code, you can git clone the repository or pause the video. Thank you! */
}
