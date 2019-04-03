package fr.simplon.addressBook.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import fr.simplon.addressBook.entities.Address;


public interface AddressJpaRepository extends JpaRepository<Address, Long> {

    @Query("DELETE FROM Address")
    @Modifying 
    void removeAll();





}
