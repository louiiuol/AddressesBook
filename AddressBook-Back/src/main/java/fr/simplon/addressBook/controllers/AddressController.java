package fr.simplon.addressBook.controllers;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import fr.simplon.addressBook.services.AddressService;

@CrossOrigin("*")
@RestController
@RequestMapping("/AddressBook")
public class AddressController {
    
    private final AddressService addressService;

    public AddressController(AddressService addressService) {
	super();
	this.addressService = addressService;
    }
    
    @GetMapping("/loading")
    protected void loading() {
	addressService.loading();
    }
    
    
    
}
