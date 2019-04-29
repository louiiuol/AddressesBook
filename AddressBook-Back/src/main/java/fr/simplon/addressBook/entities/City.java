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
    private String latitude;

    @Column(length = 100, nullable = true)
    private String longitude;
    

	public City(String cityName, String zipCode, String latitude, String longitude) {
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

	public String getLatitude() {
		return latitude;
	}

	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}

	public String getLongitude() {
		return longitude;
	}

	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}

	@Override
	public String toString() {
		return "City [cityName=" + cityName + ", zipCode=" + zipCode + ", latitude=" + latitude + ", longitude="
				+ longitude + "]";
	}
    
}
