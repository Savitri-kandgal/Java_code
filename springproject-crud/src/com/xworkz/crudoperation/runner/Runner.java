package com.xworkz.crudoperation.runner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.crudoperation.config.CrudOperationConfig;
import com.xworkz.crudoperation.dto.PolishDTO;
import com.xworkz.crudoperation.dto.SalesManagerDTO;
import com.xworkz.crudoperation.dto.SockDTO;
import com.xworkz.crudoperation.service.PolishService;
import com.xworkz.crudoperation.service.SalesManagrService;
import com.xworkz.crudoperation.service.SockService;

public class Runner {

	public static void main(String[] args) {
		
		ApplicationContext spring= new AnnotationConfigApplicationContext(CrudOperationConfig.class);
		
		System.out.println("");
		System.out.println("--------------Polish----------------");
		
		PolishDTO dto=new PolishDTO(1, "Cherry", 99);
	
		PolishService polishSrv=spring.getBean(PolishService.class);
		boolean saved=polishSrv.validateAndSave(dto);
		System.out.println("Polish DTO saved: "+saved);
		
		
		System.out.println("");
		System.out.println("--------------SalesManager----------------");
		
		SalesManagerDTO salesDto= new SalesManagerDTO(3, "Suresh" , "11 LPA");
		SalesManagrService salesSrv=spring.getBean(SalesManagrService.class);
		boolean saved1=salesSrv.validateAndSave(salesDto);
		System.out.println("SalesManager DTO saved: "+saved1);
		
		System.out.println("");
		System.out.println("--------------Sock----------------");
		
		 SockDTO sockDto = new SockDTO(1, "Adidas", "black");
		 SockService sockSrv=spring.getBean(SockService.class);
		boolean saved2=sockSrv.validateAndSave(sockDto);
		System.out.println("Sock DTO saved: "+saved2);
	}
}

