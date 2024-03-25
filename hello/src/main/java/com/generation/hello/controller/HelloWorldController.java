package com.generation.hello.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/helloworld")
public class HelloWorldController {
	
	@GetMapping() // Requisiçoes do tipo GET/ Busca
	public String Hello() {
		return "Hello World <br> BSM’s da Generation Brasil:  <br> 1º Orientação ao futuro <br> 2º Responsabilidade Pessoal <br> 3º Mentalidade de crescimento <br> 4º Persistencia <br> 5º Trabalho em equipe <br> 6º Orientação ao detalhe <br> 7º Proatividade <br> 8º Comunicação <br> ";
	}

}
