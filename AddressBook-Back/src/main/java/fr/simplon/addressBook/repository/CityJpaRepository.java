package fr.simplon.addressBook.repository;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;

import fr.simplon.addressBook.entities.City;
import fr.simplon.addressBook.entities.dtos.SearchCitiesByZipCodeDto;

/**
 * This Interface defines contract to manage Cities
 * 
 * @see JpaRepository
 * @see Modifying
 * @see Query
 * @see City
 */
public interface CityJpaRepository extends JpaRepository<City, Long> {

    @Modifying
    @Query("DELETE FROM Address")
    void removeAll();

    // @Query("SELECT new
    // fr.simplon.addressBook.entities.dtos.SearchCitiesByZipCodeDto(id,
    // cityName) FROM City WHERE zipCode= ?1")
    List<SearchCitiesByZipCodeDto> findByZipCode(String zipCode);
    //
    // @Query("SELECT new fr.simplon.addressBook.entities.City(city_name) FROM
    // City ORDER BY asc")
    // Page<City> findAll(Pageable pagination);
}
