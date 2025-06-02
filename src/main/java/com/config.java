package com;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class config extends AbstractAnnotationConfigDispatcherServletInitializer {

	@Override
	protected Class<?>[] getRootConfigClasses() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		Class[] cfgclass = {NoXml.class};
		return cfgclass;
	}

	@Override
	protected String[] getServletMappings() {
		
		String[] url = {"/ttt/*"};
		return url;
	}

	
}
