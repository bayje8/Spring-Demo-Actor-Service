package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import lombok.extern.log4j.Log4j;
import lombok.extern.slf4j.Slf4j;
/*
 * TODO Slf4j usage is unknown yet
 * 
 */
@Slf4j
@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		//log.info("DemoApplication >> getting started");

		SpringApplication.run(DemoApplication.class, args);
		//log.info("DemoApplication >> Shutted down");
	}	
}
