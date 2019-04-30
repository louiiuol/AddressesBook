package fr.simplon.addressBook.services.impl;

import javax.validation.Valid;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import fr.simplon.addressBook.AddressBookApplication;
import fr.simplon.addressBook.Dtos.CreateAddressDto;
import fr.simplon.addressBook.entities.Address;
import fr.simplon.addressBook.repository.AddressJpaRepository;
import fr.simplon.addressBook.services.AddressService;

@Service
public class AddressServiceImpl implements AddressService {

    @Autowired
    AddressJpaRepository addressRepository;

    @Autowired
    private ModelMapper mapper;
    
    private static final Logger logger = LoggerFactory.getLogger(AddressBookApplication.class);

    @Override
    public void createAddress(CreateAddressDto addressDto) {
	logger.info(addressDto.toString());
	Address address = null;
	    address = mapper.map(addressDto, Address.class);
	addressRepository.save(address);
    }
}
