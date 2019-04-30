package fr.simplon.addressBook.controllers;

import javax.validation.Valid;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import fr.simplon.addressBook.Dtos.CreateAddressDto;
import fr.simplon.addressBook.services.AddressService;

@RestController
@CrossOrigin("*")
@RequestMapping("/address")
public class AddressController {
    
    private final AddressService addressService;

    public AddressController(AddressService addressService) {
	super();
	this.addressService = addressService;
    }

    @PostMapping
    protected void createAddress(
	    @Valid @RequestBody CreateAddressDto addressDto) {
	addressService.createAddress(addressDto);
    }
    
    
    
}