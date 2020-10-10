package com.project.resources;

import javax.ejb.Singleton;
import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

@ApplicationPath("/rest")
@Singleton
public class JaxRsActivator extends Application{
	//leave here blank, its just for activation of JaxRS!!
}
