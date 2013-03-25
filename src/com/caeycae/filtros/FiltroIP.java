package com.caeycae.filtros;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class FiltroIP implements Filter {

	@Override
	public void destroy() {}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response,
			FilterChain filterChain) throws IOException, ServletException {
		
		if (ValidadorIPsDummy.getInstance().esValida(request.getRemoteAddr()))
        {
            filterChain.doFilter(request, response);
        }
		else
			throw new SecurityException("La ip solicitante no tiene perisos para acceder a este servicio");

	}

	@Override
	public void init(FilterConfig arg0) throws ServletException {}

}
