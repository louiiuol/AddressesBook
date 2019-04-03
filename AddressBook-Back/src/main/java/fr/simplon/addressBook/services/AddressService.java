package fr.simplon.addressBook.services;

import java.util.List;

import fr.simplon.addressBook.entities.Address;

public interface AddressService {
    
    void loading();
    
    public List<Address> parse();

    
    
}
