package com.example.onlineNotes;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;

@SpringBootApplication
public class OnlineNotesApplication {

	public static void main(String[] args) {
		SpringApplication.run(OnlineNotesApplication.class, args);
	}

}
