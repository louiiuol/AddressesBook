package fr.simplon.addressBook.Dtos;

public class FindCitiesByZipCodeDto {

    private Long id;

    private String cityName; 

    public FindCitiesByZipCodeDto(Long id, String cityName) {
        this.id = id;
        this.cityName = cityName;
    }

    /**
     * @return the id
     */
    public Long getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * @return the cityName
     */
    public String getCityName() {
        return cityName;
    }

    /**
     * @param cityName the cityName to set
     */
    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    
}