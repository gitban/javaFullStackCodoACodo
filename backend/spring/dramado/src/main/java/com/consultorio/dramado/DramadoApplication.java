package com.consultorio.dramado;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@SpringBootApplication
public class DramadoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DramadoApplication.class, args);
	}


	@GetMapping(path = "/")
	public List<String> getNames() {
		return List.of(
				"Esteban",
				"Gabina",
				"Noelia"
		);
	}
}