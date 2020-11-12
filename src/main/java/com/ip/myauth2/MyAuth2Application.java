package com.ip.myauth2;

import java.security.Principal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.oauth2.client.EnableOAuth2Sso;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableOAuth2Sso
@RestController
public class MyAuth2Application {

	@GetMapping("/")
	public String message(Principal principal) {
		return "Hi "+principal.getName()+" Your Oauth 2 is working fine ";
	}
	public static void main(String[] args) {
		SpringApplication.run(MyAuth2Application.class, args);
	}

}
