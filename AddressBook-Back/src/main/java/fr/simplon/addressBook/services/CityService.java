package fr.simplon.addressBook.services;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import fr.simplon.addressBook.entities.City;
import fr.simplon.addressBook.entities.dtos.SearchCitiesByZipCodeDto;
import fr.simplon.addressBook.exceptions.InvalidFileNameException;

public interface CityService {

    void loading();

    List<City> parseCsv() throws InvalidFileNameException;

    List<SearchCitiesByZipCodeDto> findCitiesByZipCode(String zipCode);

    Page<City> getCitiesPagination(Integer page);
}
