package com.nt;

import java.time.LocalDateTime;

import org.apache.log4j.Appender;
import org.apache.log4j.ConsoleAppender;
import org.apache.log4j.Layout;
import org.apache.log4j.Logger;
import org.apache.log4j.SimpleLayout;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

import com.nt.beans.WishMessageGenerator;

@SpringBootApplication
public class BootProj01WishMessageGeneratorApplication {
	private static Logger logger=Logger.getLogger(BootProj01WishMessageGeneratorApplication.class);
	@Bean("ldt")
	public LocalDateTime createLocalDateTime() {
		logger.info("Local Date Functiom is working");
		return LocalDateTime.now();
	}

	public static void main(String[] args) {
		ApplicationContext ctx= SpringApplication.run(BootProj01WishMessageGeneratorApplication.class, args);
		WishMessageGenerator generator=ctx.getBean("hello",WishMessageGenerator.class);
		System.out.println(generator.getWishMessage("Raja "));
	
	}

}
