package fr.simplon.addressBook.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.simplon.addressBook.entities.Address;

public interface AddressJpaRepository extends JpaRepository<Address, Long> {

 }
