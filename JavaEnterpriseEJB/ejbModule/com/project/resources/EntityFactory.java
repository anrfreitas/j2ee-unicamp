package com.project.resources;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.inject.Produces;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@ApplicationScoped
public class EntityFactory {
	@Produces
	@PersistenceContext
	private EntityManager em;
	
	/* This is not a WebService (WS) class, and the entity manager wont be used as a WS... So we should use enterprise.inect.Produces!! */
	
	/* The factory works just like JaxRsActivator, but for Entity Management within the project! */
}
