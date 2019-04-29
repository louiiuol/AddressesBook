package fr.simplon.addressBook;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AddressBookApplication {

	private static final Logger LOG = LogManager.getLogger();
	public static void main(String[] args) {

		LOG.info("Launching Spring Application...");
		SpringApplication.run(AddressBookApplication.class, args);
		LOG.info("Application launched with success!");
	}

}
