package fr.simplon.addressBook;

import org.modelmapper.ModelMapper;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class AddressBookApplication {
	private static final Logger logger = LoggerFactory.getLogger(AddressBookApplication.class);

	public static void main(String[] args) {
		logger.info("Starting....");
		SpringApplication.run(AddressBookApplication.class, args);
		logger.info("Started!!");
	}

	@Bean
	    public ModelMapper mapper() {
		// Could be configured changing default configuration
		return new ModelMapper();
	    }

}