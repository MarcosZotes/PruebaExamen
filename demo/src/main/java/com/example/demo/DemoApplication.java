package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);

		/*LectorJSON lector = new LectorJSON();
		Datos datos = new Datos();
		datos = lector.LecturaJSON();

		System.out.println(datos);*/
	}


}
