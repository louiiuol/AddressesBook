package fr.simplon.addressBook.controllers;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import fr.simplon.addressBook.services.AddressService;

/**
 * 
 * <h3>A Rest Controller to manage Addresses with CRUD Operations</h3>
 * <hr/>
 * <p>Methods Available:</p>
 * <ul> 
 *      <li> {@linkplain fr.simplon.addressBook.controllers.AddressController#loading loading()} => Load a CSV File into the database.</li>
 * </ul>
 * <hr/>
 * 
 *  @see CrossOrigin
 *  @see RequestMapping
 *  @see RestController
 *  @see AddressService
 *
 */
@CrossOrigin("*")
@RestController
@RequestMapping("/AddressBook")
public class AddressController {
    
    /**
     * @see AddressService
     */
    private final AddressService addressService;

    protected AddressController(AddressService addressService) {
	    super();
	    this.addressService = addressService;
    }
    
    /**
     * <p> This method load a CSV File into the database. Please check the {@linkplain fr.simplon.addressBook.services.impl.AddressServiceImpl#loading loading()} method. 
     * @see GetMapping
     * @see AddressService
     */
    @GetMapping("/loading")
    protected void loading() {
	    addressService.loading();
    }
    
}