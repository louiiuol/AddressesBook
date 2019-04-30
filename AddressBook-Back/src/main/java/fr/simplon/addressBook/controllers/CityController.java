package fr.simplon.addressBook.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import fr.simplon.addressBook.AddressBookApplication;
import fr.simplon.addressBook.Dtos.FindCitiesByZipCodeDto;
import fr.simplon.addressBook.services.CityService;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 
 * <h3>A Rest Controller to manage Addresses with CRUD Operations</h3>
 * <hr/>
 * <p>Methods Available:</p>
 * <ul> 
 *      <li> {@linkplain fr.simplon.addressBook.controllers.CityController#loading loading()} => Load a CSV File into the database.</li>
 * </ul>
 * <hr/>
 * 
 *  @see CrossOrigin
 *  @see RequestMapping
 *  @see RestController
 *  @see CityService
 *
 */
@CrossOrigin("*")
@RestController
@RequestMapping("/")
public class CityController {

    private static final Logger logger = LoggerFactory.getLogger(AddressBookApplication.class);
    
    /**
     * @see CityService
     */
    private final CityService cityService;

    protected CityController(CityService cityService) {
	    super();
	    this.cityService = cityService;
    }
    
    /**
     * <p> This method load a CSV File into the database. Please check the {@linkplain fr.simplon.addressBook.services.impl.CityServiceImpl#loading loading()} method. 
     * @see GetMapping
     * @see CityService
     */
    @GetMapping("/City/loading")
    protected void loading() {
	    cityService.loading();
    }
    
    @GetMapping("/City")
    protected List<FindCitiesByZipCodeDto> findCitiesByZipCode(
        @RequestParam(value = "zipCode", required = true) String zipCode
    ) {
        logger.info("ZipCode:" + zipCode);
        List<FindCitiesByZipCodeDto> toto = cityService.findCitiesByZipCode(zipCode);
        return toto;
    }
}