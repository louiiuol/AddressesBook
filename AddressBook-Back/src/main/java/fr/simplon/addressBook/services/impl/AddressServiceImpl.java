package fr.simplon.addressBook.services.impl;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import fr.simplon.addressBook.entities.Address;
import fr.simplon.addressBook.repository.AddressJpaRepository;
import fr.simplon.addressBook.services.AddressService;

@Service
public class AddressServiceImpl implements AddressService {

    private final AddressJpaRepository repoAddress;

    @Value("${file.csv}")
    public String url;

    public AddressServiceImpl(AddressJpaRepository repoAddress) {
	this.repoAddress = repoAddress;
    }

    @Override
    public List<Address> parse() {
	List<Address> address = new ArrayList<>();
	try (BufferedReader br = new BufferedReader(new FileReader(url))) {
	    String line;
	    while ((line = br.readLine()) != null) {
		String[] values = line.split(";");
		String zipCode = null;
		String cityName = null;
		for (int i = 0; i < values.length; i++) {
			if (i == 1) {
			    if (values[i].equals("Nom_commune")) {
				break;}
			    cityName = values[i];
			} else if (i == 2) {
			    zipCode = values[i];
			} else {
			    if (i == 3) {
				address.add(new Address(cityName, zipCode));
			    }
			}
		    }
		}
	} catch (FileNotFoundException e) {
	    System.out.println("ya un pb");
	} catch (IOException e) {
	    // TODO Auto-generated catch block
	    e.printStackTrace();
	}
	return address;
    }

    @Override
    public void loading() {
	System.out.println(parse());
	
	repoAddress.saveAll(parse());
    }
}
