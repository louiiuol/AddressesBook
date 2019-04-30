package fr.simplon.addressBook.services;

import java.util.List;

import fr.simplon.addressBook.Dtos.FindCitiesByZipCodeDto;
import fr.simplon.addressBook.entities.City;
import fr.simplon.addressBook.exceptions.InvalidFileNameException;

public interface CityService {
    
    void loading();
    
    public List<City> parseCsv() throws InvalidFileNameException;

	List<FindCitiesByZipCodeDto> findCitiesByZipCode(String zipCode);
    
}
