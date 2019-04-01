package fr.simplon.addressBook.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import fr.simplon.addressBook.entities.Address;
import fr.simplon.addressBook.services.AddressService;

@RestController
@RequestMapping("/Address")
public class AddressController {
    
    private final AddressService addressService;

    public AddressController(AddressService addressService) {
	super();
	this.addressService = addressService;
    }
    
    @GetMapping("/get/{id}")
    protected Address getAddress(@PathVariable("id") Long id) {
	return addressService.getAddressBook(id); 
    }
    
    
    
}
