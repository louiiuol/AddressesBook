package fr.simplon.addressBook.services.impl;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import fr.simplon.addressBook.entities.Address;
import fr.simplon.addressBook.exceptions.InvalidFileNameException;
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
    public List<Address> parse()  {
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
	} catch (IOException e) {
	    // TODO Auto-generated catch block
	    e.printStackTrace();
	    if ("".equals(url) || url != "src/main/resources/poste.csv") {
			throw new InvalidFileNameException("File not found !!", e);
		}
	}
	return address;
    }

    @Override
    @Transactional
    public void loading() {
	repoAddress.removeAll();
	repoAddress.saveAll(parse());
    }
}
