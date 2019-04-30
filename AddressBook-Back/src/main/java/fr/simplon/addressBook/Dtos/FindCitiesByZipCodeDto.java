package fr.simplon.addressBook.Dtos;

import javax.persistence.Column;

public class FindCitiesByZipCodeDto {
    @Column(length = 100, nullable = false)
private String cityName; 

    @Column(length = 5, nullable = false)
    private String zipCode;
}


