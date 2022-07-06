package DesignPattern;

public class Address {

    public String city;
    public String state;
    public String country;
    public String street;

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    @Override
    public String toString() {
        return "Street: " + street + " City: " + city + " Street: " + street + " Country " + country;
    }

    public static AddressBuilder builder() {
        return new AddressBuilder();
    }

    public static class AddressBuilder {

        private String city;
        private String state;
        private String country;
        private String street;
        private final Address address;

        AddressBuilder() {
            address = new Address();
        }

        public AddressBuilder setCity(String city) {
            this.city = city;
            return this;
        }

        public AddressBuilder setState(String state) {
            this.state = state;
            return this;
        }

        public AddressBuilder setCountry(String country) {
            this.country = country;
            return this;
        }

        public AddressBuilder setStreet(String street) {
            this.street = street;
            return this;
        }



        public Address build() {
            return this.build(street, city, state, country);
        }

        private Address build(String street, String city, String state, String country) {
            address.setStreet(street);
            address.setCity(city);
            address.setState(state);
            address.setCountry(country);

            return this.address;
        }

        public Address getAddress() {
            return this.address;
        }

    }

}
