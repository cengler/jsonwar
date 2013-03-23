package com.caeycae.servicios;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;

import com.caeycae.model.Cantante;

@Path ("/")
public class Servicios {

	@Produces ("text/plain")
	@GET 
	@Path("/personas")
	public String GetControls(@Context HttpServletRequest request) {
		
		String remoteAddr = request.getRemoteAddr();
		if(!ValidadorIPsDummy.getInstance().esValida(remoteAddr))
			return "IP sin acceso";
		
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