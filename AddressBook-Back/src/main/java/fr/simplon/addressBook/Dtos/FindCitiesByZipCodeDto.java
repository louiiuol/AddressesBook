package fr.simplon.addressBook.Dtos;

public class FindCitiesByZipCodeDto 


@Column(length = 100, nullable = false)
private String cityName; 

@Column(length = 5, nullable = false)
private String zipCode;