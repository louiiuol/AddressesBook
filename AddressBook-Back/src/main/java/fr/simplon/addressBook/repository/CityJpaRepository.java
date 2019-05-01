package fr.simplon.addressBook.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import fr.simplon.addressBook.entities.City;
import fr.simplon.addressBook.entities.dtos.SearchCitiesByZipCodeDto;

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
    @Query("SELECT new fr.simplon.addressBook.entities.dtos.SearchCitiesByZipCodeDto(id, cityName) FROM City WHERE zipCode= ?1")
    List<SearchCitiesByZipCodeDto> findByZipCode(String zipCode);

}
