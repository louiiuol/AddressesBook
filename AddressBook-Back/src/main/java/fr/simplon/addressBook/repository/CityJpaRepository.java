package fr.simplon.addressBook.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import fr.simplon.addressBook.Dtos.FindCitiesByZipCodeDto;
import fr.simplon.addressBook.entities.City;

/**
 * 
 * This Interface defines contract to manage Cities
 * 
 * @see JpaRepository
 * @see Modifying
 * @see Query
 * @see City
 * 
*/
public interface CityJpaRepository extends JpaRepository<City, Long> {

    @Modifying 
    @Query("DELETE FROM Address")
    void removeAll();

    @Modifying
    @Query("SELECT new fr.simplon.addressBook.Dtos.FindCitiesByZipCodeDto(id, cityName) FROM City WHERE zipCode= ?1")
    List<FindCitiesByZipCodeDto> findByZipCode(String zipCode);

}
