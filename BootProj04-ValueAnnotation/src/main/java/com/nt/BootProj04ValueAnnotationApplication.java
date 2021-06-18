package com.nt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import com.nt.bean.BillGenerator;

@SpringBootApplication
public class BootProj04ValueAnnotationApplication {

	public static void main(String[] args) {
		ApplicationContext ctx= SpringApplication.run(BootProj04ValueAnnotationApplication.class, args);
		BillGenerator generator=ctx.getBean("bill",BillGenerator.class);
		System.out.println(generator.toString());	
		((ConfigurableApplicationContext) ctx).close();
	}

}
