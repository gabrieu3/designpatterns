package com.designpatterns.creational.builder.withbuilder;

public class Address {

    private String address;
    private Integer houseNumber;
    private String zipCode;
    private String city;

    public Address(final AddressBuilder builder) {
        this.address = builder.address;
        this.houseNumber = builder.houseNumber;
        this.zipCode = builder.zipCode;
        this.city = builder.city;
    }

    public static AddressBuilder builder(){
        return new AddressBuilder();
    }

    public static class AddressBuilder{
        private String address;
        private Integer houseNumber;
        private String zipCode;
        private String city;

        public AddressBuilder address(String address){
            this.address = address;
            return this;
        }

        public AddressBuilder houseNumber(Integer houseNumber){
            this.houseNumber = houseNumber;
            return this;
        }

        public AddressBuilder zipCode(String zipCode){
            this.zipCode = zipCode;
            return this;
        }

        public AddressBuilder city(String city){
            this.city = city;
            return this;
        }

        public Address build(){
            return new Address(this);
        }


    }


}
