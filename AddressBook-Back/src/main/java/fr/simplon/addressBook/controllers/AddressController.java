package fr.simplon.addressBook.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import fr.simplon.addressBook.entities.Address;
import fr.simplon.addressBook.services.AddressService;

@RestController
@RequestMapping("/addressBook")
public class AddressController {
    
    private final AddressService addressService;

    public AddressController(AddressService addressService) {
	super();
	this.addressService = addressService;
    }
    
    @GetMapping("/loading")
    protected void loading() {
	System.out.println("je suis bien appelé");
	addressService.loading();
    }
    
    
    
}
