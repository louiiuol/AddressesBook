package fr.simplon.addressBook.services.impl;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import fr.simplon.addressBook.AddressBookApplication;
import fr.simplon.addressBook.entities.City;
import fr.simplon.addressBook.entities.dtos.SearchCitiesByZipCodeDto;
import fr.simplon.addressBook.exceptions.InvalidFileNameException;
import fr.simplon.addressBook.repository.CityJpaRepository;
import fr.simplon.addressBook.services.CityService;


@Service
public class CityServiceImpl implements CityService {

    @Value("${file.csv}")
	public String url;
	
	private static final Logger logger = LoggerFactory.getLogger(AddressBookApplication.class);
	
	private final CityJpaRepository repoCity;

    public CityServiceImpl(CityJpaRepository repoAddress) { this.repoCity = repoAddress; }

    @Override
    public List<City> parseCsv()  {
	
		List<City> cities = new ArrayList<>();
	
		try {
			List<String> contents = Files.readAllLines(Paths.get(url));
			for (String content:contents ) {
				
				String[] values = content.split(";");
				if (values[0].equals("Code_commune_INSEE")) {
					continue;
				}
				String zipCode = null;
				String cityName = null;
				String gpsCoordinates = null;
				Double latitude = null;
				Double longitude = null;
				
				if (values.length == 4 || (values.length == 5 && !(values[values.length-1].contains(",")))) {
					latitude = null;
					longitude = null;
				}else { 
					if ((values.length == 5 && values[values.length-1].contains(",")) || values.length == 6) {
						gpsCoordinates = values[values.length-1];
						String[] tab = gpsCoordinates.split(",");
						latitude = Double.valueOf(tab[0]);
						longitude = Double.valueOf(tab[1]);
					}
				}
				cityName = values[1];
				zipCode = values[2];
				cities.add(new City(cityName, zipCode, latitude, longitude));
			}
				
		} catch (IOException e) {
			logger.error("IO Exception: " + e.getMessage());
			if ("".equals(url) || url != "src/main/resources/poste.csv") {
				throw new InvalidFileNameException("File not found !!", e);
			} else {

			}
	}
	return cities;
	}
	   
    @Override
    @Transactional
    public void loading() {
			repoCity.removeAll();
			repoCity.saveAll(parseCsv());
	}
	
	@Override
	public List<SearchCitiesByZipCodeDto> findCitiesByZipCode(String zipCode) {
		return repoCity.findByZipCode(zipCode);
	}
}