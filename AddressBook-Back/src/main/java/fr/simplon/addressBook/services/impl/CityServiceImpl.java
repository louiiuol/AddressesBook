package fr.simplon.addressBook.services.impl;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import fr.simplon.addressBook.entities.City;
import fr.simplon.addressBook.exceptions.InvalidFileNameException;
import fr.simplon.addressBook.repository.CityJpaRepository;
import fr.simplon.addressBook.services.CityService;


@Service
public class CityServiceImpl implements CityService {

    private final CityJpaRepository repoAddress;

    @Value("${file.csv}")
    public String url;

    public CityServiceImpl(CityJpaRepository repoAddress) {
	this.repoAddress = repoAddress;
    }

    @Override
    public List<City> parseCsv()  {
	
		List<City> cities = new ArrayList<>();
	
		
		
		try {
			List<String> contents = Files.readAllLines(Paths.get(url));
			for (String content:contents ) {
				
				String[] values = content.split(";");
				String zipCode = null;
				String cityName = null;
				String gpsCoordinates = null;
				
				for (int i = 0; i < values.length; i++) {
					if (i == 1) {
						if (values[i].equals("Nom_commune")) { break;}
						cityName = values[i];
					} else if (i == 2) {
						zipCode = values[i];
					} else if (i == 5) {
						gpsCoordinates = values[i];
						if (!gpsCoordinates.equals(null) && !cityName.equals(null)&& !zipCode.equals(null)) {
							String[] tab = gpsCoordinates.split(",");
							Double latitude = Double.valueOf(tab[0]);
							Double longitude = Double.valueOf(tab[1]);
							cities.add(new City(cityName, zipCode, latitude, longitude));}
					}
				}
			}
		} catch (IOException e) {
	    if ("".equals(url) || url != "src/main/resources/poste.csv") {
			throw new InvalidFileNameException("File not found !!", e);
		}
	}
	return cities;
    }

    
    
    @Override
    @Transactional
    public void loading() {
			repoAddress.removeAll();
			repoAddress.saveAll(parseCsv());
    }
}