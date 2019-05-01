package fr.simplon.addressBook.services.impl;

import org.modelmapper.ModelMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.simplon.addressBook.AddressBookApplication;
import fr.simplon.addressBook.entities.Address;
import fr.simplon.addressBook.entities.dtos.CreateAddressDto;
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
        addressRepository.save(mapper.map(addressDto, Address.class));
        logger.info("Address saved: " + addressDto);
    }
}
