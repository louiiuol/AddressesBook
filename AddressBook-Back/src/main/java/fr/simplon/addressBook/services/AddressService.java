package fr.simplon.addressBook.services;

import javax.validation.Valid;

import fr.simplon.addressBook.Dtos.CreateAddressDto;

public interface AddressService {

    void createAddress(@Valid CreateAddressDto addressDto);
}
