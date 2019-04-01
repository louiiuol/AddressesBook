package fr.simplon.addressBook.services;

import java.util.List;

import fr.simplon.addressBook.entities.Address;

public interface AddressService {

    Address getAddressBook(Long id);
    
    public List<Address> parse();
    
}
