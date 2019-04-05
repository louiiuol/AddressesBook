package fr.simplon.addressBook.services;

import java.util.List;

import fr.simplon.addressBook.entities.Address;
import fr.simplon.addressBook.exceptions.InvalidFileNameException;

public interface AddressService {
    
    void loading();
    
    public List<Address> parse() throws InvalidFileNameException;

    
    
}
