package com.caeycae.servicios;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;

public class ValidadorIPsDummy implements IValidadorIPs {

	private static ValidadorIPsDummy instancia;
	private final static Logger LOGGER = Logger.getLogger(ValidadorIPsDummy.class); 
	private List<String> ipsValidas;

	private ValidadorIPsDummy()
	{
		ipsValidas = new ArrayList<String>();
		ipsValidas.add("192.168.0.1");
		ipsValidas.add("192.168.0.18");
		ipsValidas.add("0:0:0:0:0:0:0:1");
	}
	
	public static ValidadorIPsDummy getInstance()
	{
		if(instancia == null)
			instancia = new ValidadorIPsDummy();
		return instancia;
	}
	
	@Override
	public boolean esValida(String ip) {
		boolean valida = ipsValidas.contains(ip);
		if(!valida)
			LOGGER.info("Acceso denegado a: " + ip);
		else
			LOGGER.debug("Acceso permitido a: " + ip);
		return valida;
	}

}
