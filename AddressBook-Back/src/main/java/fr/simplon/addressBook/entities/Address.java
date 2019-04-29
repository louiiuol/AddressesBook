package fr.simplon.addressBook.entities;

import javax.persistence.Column;
import javax.persistence.Entity;

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

    private String deliveryPoint; 

    private String complementary;

    @Column(length = 38, nullable = false)
    private String street;

    private String distribService;

    @Column(nullable = false)
    private City city;

    @Column(nullable = false)
    private Boolean isProfessional;

    /**
     * @return the addressee
     */
    public String getAddressee() {
        return addressee;
    }

    /**
     * @param addressee the addressee to set
     */
    public void setAddressee(String addressee) {
        this.addressee = addressee;
    }

    /**
     * @return the deliveryPoint
     */
    public String getDeliveryPoint() {
        return deliveryPoint;
    }

    /**
     * @param deliveryPoint the deliveryPoint to set
     */
    public void setDeliveryPoint(String deliveryPoint) {
        this.deliveryPoint = deliveryPoint;
    }

    /**
     * @return the complementary
     */
    public String getComplementary() {
        return complementary;
    }

    /**
     * @param complementary the complementary to set
     */
    public void setComplementary(String complementary) {
        this.complementary = complementary;
    }

    /**
     * @return the street
     */
    public String getStreet() {
        return street;
    }

    /**
     * @param street the street to set
     */
    public void setStreet(String street) {
        this.street = street;
    }

    /**
     * @return the distribService
     */
    public String getDistribService() {
        return distribService;
    }

    /**
     * @param distribService the distribService to set
     */
    public void setDistribService(String distribService) {
        this.distribService = distribService;
    }

    /**
     * @return the city
     */
    public City getCity() {
        return city;
    }

    /**
     * @param city the city to set
     */
    public void setCity(City city) {
        this.city = city;
    }

    /**
     * @return the isProfessional
     */
    public Boolean getIsProfessional() {
        return isProfessional;
    }

    /**
     * @param isProfessional the isProfessional to set
     */
    public void setIsProfessional(Boolean isProfessional) {
        this.isProfessional = isProfessional;
    }

    @Override
    public String toString() {
        return "Address [addressee=" + addressee + ", city=" + city + ", complementary=" + complementary
                + ", deliveryPoint=" + deliveryPoint + ", distribService=" + distribService + ", isProfessional="
                + isProfessional + ", street=" + street + "]";
    }
    
    
}
