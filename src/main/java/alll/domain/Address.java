package alll.domain;

public class Address {

    private String street;
    private String streetNumber;


    public Address(String street, String streetNumber) {
        this.street = street;
        this.streetNumber = streetNumber;
    }

    public String getStreet() {
        return street;
    }


    public void setStreet(String street) {
        this.street = street;
    }

    public String getStreetNumber() {
        return streetNumber;
    }

    public void setStreetNumber(String streetNumber) {
        this.streetNumber = streetNumber;
    }

    public String fullAddress() {
        return  street + " " + streetNumber;
    }
}
