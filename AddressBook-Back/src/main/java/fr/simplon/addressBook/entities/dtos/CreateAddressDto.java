package fr.simplon.addressBook.entities.dtos;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class CreateAddressDto {

    @NotNull
    @Size(max = 38)
    private String addressee;

    private String deliveryPoint;

    private String complementary;

    @NotNull
    @Size(max = 38)
    private String street;

    private String distribService;

    private Long cityId;

    @NotNull
    private Boolean isProfessional;

    public CreateAddressDto() { super(); }

    public String getAddressee() { return addressee; }
    public void setAddressee(String addressee) { this.addressee = addressee; }

    public String getDeliveryPoint() { return deliveryPoint; }
    public void setDeliveryPoint(String deliveryPoint) { this.deliveryPoint = deliveryPoint; }

    public String getComplementary() { return complementary; }
    public void setComplementary(String complementary) { this.complementary = complementary; }

    public String getStreet() { return street; }
    public void setStreet(String street) { this.street = street; }

    public String getDistribService() { return distribService; }
    public void setDistribService(String distribService) { this.distribService = distribService; }

    public Long getCityId() { return cityId; }
    public void setCityId(Long cityId) { this.cityId = cityId; }

    public Boolean getIsProfessional() { return isProfessional; }
    public void setIsProfessional(Boolean isProfessional) { this.isProfessional = isProfessional; }

    @Override
    public String toString() {
	return "CreateAddressDto [addressee=" + addressee + ", deliveryPoint="
		+ deliveryPoint + ", complementary=" + complementary
		+ ", street=" + street + ", distribService=" + distribService
		+ ", cityId=" + cityId + ", isProfessional=" + isProfessional
		+ "]";
    }
}
