package fr.simplon.addressBook.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;

/**
 *  
 *  <h3>This class Represents an address model and the mapping strategy for the addresses.</h3>
 *  <p>Addresses are defined by:</p>
 *  <ul>
 *      <li><i>long</i>     {@code id}</li>
 *      <li><i>String</i>   {@code zipCode} <i>(10)</i></li>
 *      <li><i>String</i>   {@code cityName} <i>(100)</i></li>
 * </ul>
 * <hr/>
 * 
 * @see Column
 * @see Entity
 * @see AbstractEntity
 *
 */
@Entity
public class Address extends AbstractEntity {
    
    private static final long serialVersionUID = -7210695746686621242L;

    @Column(length = 38, nullable = false)
    private String addressee;

    @Column(length = 38, nullable = true)
    private String deliveryPoint; 

    @Column(length = 38, nullable = true)
    private String complementary;

    @Column(length = 38, nullable = false)
    private String street;

    @Column(length = 38, nullable = true)
    private String distribService;

    @ManyToOne
    private City city;

    @Column(nullable = false)
    private Boolean isProfessional;

    protected Address() { super(); }

    public Address(String addressee, String street, String distribService, City city, Boolean isProfessional) {
        super();
        this.addressee = addressee;
        this.street = street;
        this.distribService = distribService;
        this.city = city; 
        this.isProfessional = isProfessional; 
        this.deliveryPoint = null; 
        this.complementary = null;
    }

    public Address(String addressee, String street, String distribService, City city, Boolean isProfessional, String deliveryPoint, String complementary) {
        this.addressee = addressee;
        this.street = street;
        this.distribService = distribService;
        this.city = city; 
        this.isProfessional = isProfessional; 
        this.deliveryPoint = deliveryPoint; 
        this. complementary = complementary;
    }

    public String getAddressee() { return addressee; }

    public void setAddressee(String addressee) { this.addressee = addressee; }

    public String getDeliveryPoint() { return deliveryPoint; }
    public void setDeliveryPoint(String deliveryPoint) { this.deliveryPoint = deliveryPoint; }

    public String getComplementary() { return complementary; }
    public void setComplementary(String complementary) { this.complementary = complementary; }

    public String getStreet() { return street; }
    public void setStreet(String street) { this.street = street; }

    public String getDistribService() { return distribService; }
    public void setDistribService(String distribService) { this.distribService = distribService; }

    public City getCity() { return city; }
    public void setCity(City city) { this.city = city; }

    public Boolean getIsProfessional() { return isProfessional; }
    public void setIsProfessional(Boolean isProfessional) { this.isProfessional = isProfessional; }

    @Override
    public String toString() {
        return "Address [addressee=" + addressee + ", city=" + city + ", complementary=" + complementary
                + ", deliveryPoint=" + deliveryPoint + ", distribService=" + distribService + ", isProfessional="
                + isProfessional + ", street=" + street + "]";
    }
    
}
