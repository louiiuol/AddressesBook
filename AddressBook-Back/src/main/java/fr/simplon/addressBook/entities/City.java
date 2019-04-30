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
public class City extends AbstractEntity {
    
    private static final long serialVersionUID = -7210695746686621242L;

    @Column(length = 100, nullable = false)
    private String cityName; 
    
    @Column(length = 5, nullable = false)
    private String zipCode;

    @Column(length = 100, nullable = true)
    private Double latitude;

    @Column(length = 100, nullable = true)
    private Double longitude;
    
    public City(String city, String zipCode) {
    	super();
    	this.zipCode = zipCode;
        this.cityName = city;
    }
    protected City() {
    }


	public City(String cityName, String zipCode, Double latitude, Double longitude) {
		super();
		this.cityName = cityName;
		this.zipCode = zipCode;
		this.latitude = latitude;
		this.longitude = longitude;
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

	public Double getLatitude() {
		return latitude;
	}

	public void setLatitude(Double latitude) {
		this.latitude = latitude;
	}

	public Double getLongitude() {
		return longitude;
	}

	public void setLongitude(Double longitude) {
		this.longitude = longitude;
	}

	@Override
	public String toString() {
		return "City [cityName=" + cityName + ", zipCode=" + zipCode + ", latitude=" + latitude + ", longitude="
				+ longitude + "]";
	}
    
}
