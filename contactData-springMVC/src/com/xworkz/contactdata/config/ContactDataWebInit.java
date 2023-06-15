package com.xworkz.contactdata.config;

import javax.servlet.MultipartConfigElement;
import javax.servlet.ServletRegistration.Dynamic;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;
import com.xworkz.contactdata.constant.ContactDataConstant;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class ContactDataWebInit extends AbstractAnnotationConfigDispatcherServletInitializer{

	@Override
	protected Class<?>[] getRootConfigClasses() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		System.out.println("running getServletConfigClasses()...");
		return new Class[] {ContactDataSpringConfig.class};
	}

	@Override
	protected String[] getServletMappings() {
		log.info("running getServletMappings()");
		return new String[] {"/"};
	}

	@Override
	protected void customizeRegistration(Dynamic registration) {
		int maxSize=ContactDataConstant.MAX_FILE_SIZE;	//800000000;
		MultipartConfigElement multipartConfigElement=
									new MultipartConfigElement(ContactDataConstant.TEMP_FILE_LOCATION, maxSize, maxSize*2, maxSize/2);
		registration.setMultipartConfig(multipartConfigElement);
	}
	
	
}
