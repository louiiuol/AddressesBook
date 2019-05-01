package fr.simplon.addressBook.controllers;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import fr.simplon.addressBook.AddressBookApplication;
import fr.simplon.addressBook.entities.dtos.CreateAddressDto;
import fr.simplon.addressBook.services.AddressService;

@RestController
@CrossOrigin("*")
@RequestMapping("/Addresses")
public class AddressController {

    private static final Logger logger = LoggerFactory.getLogger(AddressBookApplication.class);

    private final AddressService addressService;

    public AddressController(AddressService addressService) {
        super();
        this.addressService = addressService;
    }

    @PostMapping
    protected void createAddress( @Valid @RequestBody CreateAddressDto addressDto) {
	    logger.info("Adding the entity: " + addressDto.toString());
	    addressService.createAddress(addressDto);
	    logger.info("Address created: " + addressDto);
    }
}
