package com.ceiba.cinema;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;



@SpringBootApplication
@ComponentScan({"co.com.ceiba.cinema"})
public class CinemaApplication {

	public static void main(String[] args) {
		SpringApplication.run(CinemaApplication.class, args);
	}

}
