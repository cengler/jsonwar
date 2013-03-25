package com.caeycae.servicios;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.caeycae.model.Cantante;
import com.caeycae.model.DatabaseDummy;

@Path ("/")
public class Servicios {

	@Produces ("text/plain")
	@GET 
	@Path("/personas")
	// agregar @Context HttpServletRequest request como parametro si se desea acceder al contexto
	public String GetControls() {
		
		String json = "{\"success\":\"true\",\"controls\":[{\"controlID\":\"1\",\"type\":\"TEXTBOX\"},{\"controlID\":\"4\",\"type\":\"CHECKBOX\"}]}";
		return json;

	}

	@GET 
	@Path("/cantantes")
	@Produces(MediaType.APPLICATION_JSON)
	public List<Cantante> getCantantes()
	{
		return DatabaseDummy.getInstance().getCantantes();
	}
}