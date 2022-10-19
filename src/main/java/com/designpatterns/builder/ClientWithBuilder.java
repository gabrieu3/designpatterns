package com.designpatterns.builder;

import java.util.List;

public class ClientWithBuilder {


        private String firstName;
        private String lastName;
        private List<String> middleNames;
        private Integer age;
        private String address;
        private Integer houseNumber;
        private String zipCode;
        private String city;

        public ClientWithBuilder(String firstName, String lastName, List<String> middleNames, Integer age, String address, Integer houseNumber, String zipCode, String city) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.middleNames = middleNames;
            this.age = age;
            this.address = address;
            this.houseNumber = houseNumber;
            this.zipCode = zipCode;
            this.city = city;
        }
    }


