package fr.simplon.addressBook.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import fr.simplon.addressBook.entities.Address;

/**
 * 
 * This Interface defines contract to manage Addresses
 * 
 * @see JpaRepository
 * @see Modifying
 * @see Query
 * @see Address
 * 
*/
public interface AddressJpaRepository extends JpaRepository<Address, Long> {

    @Modifying 
    @Query("DELETE FROM Address")
    void removeAll();

}
