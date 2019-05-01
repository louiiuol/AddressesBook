package fr.simplon.addressBook.services;

import fr.simplon.addressBook.entities.dtos.CreateAddressDto;

public interface AddressService {

    void createAddress(CreateAddressDto addressDto);
}
