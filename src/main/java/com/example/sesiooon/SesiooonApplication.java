package com.example.sesiooon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.client.RestTemplate;
// con el GETJSON  TRAE LA INFORMACION INICIALIZADa
@SpringBootApplication
public class SesiooonApplication {

	public static void main(String[] args) {
		SpringApplication.run(SesiooonApplication.class, args);

		// Crea un objeto RestTemplate para realizar las peticiones HTTP
		RestTemplate restTemplate = new RestTemplate();
        //hace peticiones
		// Realiza una petición GET a la API de jsonplaceholder para obtener la lista de publicaciones (posts) del usuario con ID 1
		String url = "https://jsonplaceholder.typicode.com/posts?userId=1";  //nos tae la informacion
		Post[] posts = restTemplate.getForObject(url, Post[].class);  //crea una clase

		// Imprime los títulos de las publicaciones
		for (Post post : posts) {  //trae la informacion de la clase
			System.out.println(post.getTitle());//ln imprime loa contenidos get de la base datos deljson

		}
	}

}
