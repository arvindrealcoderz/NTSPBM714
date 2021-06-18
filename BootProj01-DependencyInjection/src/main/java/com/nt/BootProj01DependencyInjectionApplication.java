package com.nt;

import java.time.LocalDateTime;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;

import com.nt.beans.WishMessageGenerator;

@SpringBootApplication
public class BootProj01DependencyInjectionApplication {
	
	@Bean
	@Scope()
	public LocalDateTime createLocalDateTime() {
		System.out.println("BootProj01DependencyInjectionApplication.createLocalDateTime()");
		return LocalDateTime.now();
	}

	public static void main(String[] args) {
		//create IOCcontainer
		ApplicationContext ctx= SpringApplication.run(BootProj01DependencyInjectionApplication.class, args);
		//getBean id
		WishMessageGenerator wish= ctx.getBean("wish",WishMessageGenerator.class);
		System.out.println(wish.Wish("Arvind"));
	}

}
