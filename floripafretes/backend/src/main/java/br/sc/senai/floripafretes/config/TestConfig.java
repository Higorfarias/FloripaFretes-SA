package br.sc.senai.floripafretes.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import br.sc.senai.floripafretes.services.EmailService;
import br.sc.senai.floripafretes.services.MockEmailService;

@Configuration
@Profile("test")
public class TestConfig {

	@Bean
	public EmailService emailService() {
		return new MockEmailService();
	}
}
