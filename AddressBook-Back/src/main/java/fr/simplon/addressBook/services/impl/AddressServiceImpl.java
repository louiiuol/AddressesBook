package fr.simplon.addressBook.services.impl;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import fr.simplon.addressBook.entities.Address;
import fr.simplon.addressBook.repository.AddressJpaRepository;
import fr.simplon.addressBook.services.AddressService;

@Service
public class AddressServiceImpl implements AddressService {

    private final AddressJpaRepository repoAddress;

    public String url = "C:/Users/Administrateur/Downloads/poste.csv";

    public AddressServiceImpl(AddressJpaRepository repoAddress) {
	this.repoAddress = repoAddress;
    }

    @Override
    public List<Address> parse() {
	List<List<String>> records = new ArrayList<>();
	List<Address> address = new ArrayList<>();
	try (BufferedReader br = new BufferedReader(new FileReader(url))) {
	    String line;
	    while ((line = br.readLine()) != null) {
		String[] values = line.split(";");
		records.add(Arrays.asList(values));
		String zipCode = null;
		String cityName = null;
		for (int i = 0; i < values.length; i++) {
		    if (i == 1) {
			cityName = values[i];
		    } else if (i == 2) {
			zipCode = values[i];
		    } else if ((i != 1 || i != 2) && i > 0) {
			address.add(new Address(cityName, zipCode));
		    }
		}
		System.out.println();
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
	
	if(repoAddress.count() == 0 ) {
	    repoAddress.saveAll(parse());
	} else {
	   // repoAddress.removeAll();
	    repoAddress.deleteAll();
	    repoAddress.saveAll(parse());
	}
	
    }

}
