package com.caeycae.servicios;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.caeycae.model.Cantante;
import com.caeycae.model.Tema;

public class DatabaseDummy {

	private List<Tema> temas;
	private List<Cantante> cantantes;
	private static DatabaseDummy instance;
	
	private DatabaseDummy()
	{
		temas = new ArrayList<Tema>();
		cantantes = new ArrayList<Cantante>();
		
		Cantante c1 = new Cantante("Mick Jager", new Date());
		cantantes.add(c1);
		Cantante c2 = new Cantante("Indio Solari", new Date());
		cantantes.add(c2);
		
		Tema t1 = new Tema("Paint It Black", c1, 3.08d, 1);
		temas.add(t1);
		Tema t2 = new Tema("Todos a los botes!", c2, 2.88d, 1);
		temas.add(t2);
		Tema t3 = new Tema("Martinis y los Tafiroles ", c2, 3.25d, 1);
		temas.add(t3);
	}
	
	public List<Cantante> getCantantes()
	{
		return cantantes;
	}

	public static DatabaseDummy getInstance() {
		if (instance == null)
			instance = new DatabaseDummy();
		return instance;
	}
}
