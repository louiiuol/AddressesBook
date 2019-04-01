package fr.simplon.addressBook.entities;

import javax.persistence.Column;
import javax.persistence.Entity;

/**
 * Represents an address, defined by its id, zip code and city name.
 *
 */
@Entity
public class Address extends AbstractEntity {
    
    
    private static final long serialVersionUID = -7210695746686621242L;

    @Column(length = 100, nullable = false)
    private String cityName; 
    
    @Column(length = 10, nullable = false)
    private String zipCode;

    public Address(String city, String zipCode) {
    	super();
    	this.zipCode = zipCode;
    	this.cityName = city;
	
    }

    
    public String getCityName() {
        return cityName;
    }

    
    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    
    public String getZipCode() {
        return zipCode;
    }

    
    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }
    
    
}
