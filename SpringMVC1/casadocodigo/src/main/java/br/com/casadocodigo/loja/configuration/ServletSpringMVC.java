package br.com.casadocodigo.loja.configuration;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import br.com.casadocodigo.loja.configuration.AppWebConfiguration;

public class ServletSpringMVC extends AbstractAnnotationConfigDispatcherServletInitializer{

	@Override
	protected Class<?>[] getRootConfigClasses() {
		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		return new Class[] {AppWebConfiguration.class};
	}

	@Override
	protected String[] getServletMappings() {
		return new String[] {"/"};
	}

}
