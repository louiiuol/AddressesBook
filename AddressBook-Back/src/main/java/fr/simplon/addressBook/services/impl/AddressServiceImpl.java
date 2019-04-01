package fr.simplon.addressBook.services.impl;



import org.springframework.stereotype.Service;

import fr.simplon.addressBook.entities.Address;
import fr.simplon.addressBook.repository.AddressJpaRepository;
import fr.simplon.addressBook.services.AddressService;

@Service
public class AddressServiceImpl implements AddressService {
    
    
    private final AddressJpaRepository repoAddress;
    
    

    public AddressServiceImpl(AddressJpaRepository repoAddress) {
	super();
	this.repoAddress = repoAddress;
    }



    @Override
    public Address getAddressBook(Long id) {
	
	Address addressBook = repoAddress.findById(id).get();
	return addressBook;
    }
}
