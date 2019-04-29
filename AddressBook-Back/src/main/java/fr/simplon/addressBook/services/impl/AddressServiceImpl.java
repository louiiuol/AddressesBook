package fr.simplon.addressBook.services.impl;

import javax.validation.Valid;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;

import fr.simplon.addressBook.Dtos.CreateAddressDto;
import fr.simplon.addressBook.entities.Address;
import fr.simplon.addressBook.repository.AddressJpaRepository;
import fr.simplon.addressBook.services.AddressService;

public class AddressServiceImpl implements AddressService {

    @Autowired
    AddressJpaRepository addressRepository;

    private ModelMapper mapper;

    @Override
    public void createAddress(@Valid CreateAddressDto addressDto) {
	Address address = mapper.map(addressDto, Address.class);
	addressRepository.save(address);
    }
}
