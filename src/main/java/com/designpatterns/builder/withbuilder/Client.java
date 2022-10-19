package com.designpatterns.builder.withbuilder;

public class Client {
    private Integer age;
    private String email;
    private Name name;
    private Address address;

    private Client(final ClientBuilder builder){
        this.age = builder.age;
        this.email = builder.email;
        this.name = builder.name;
        this.address = builder.address;
    }

    public static ClientBuilder builder(){
        return new ClientBuilder();
    }
    public static class ClientBuilder {
        private Integer age;
        private String email;
        private Name name;
        private Address address;

        public ClientBuilder age(final Integer age){
            this.age = age;
            return this;
        }

        public ClientBuilder email(final String email){
            this.email = email;
            return this;
        }

        public ClientBuilder name(final Name name){
            this.name = name;
            return this;
        }

        public ClientBuilder address(final Address address){
            this.address = address;
            return this;
        }

        public Client build(){
            return new Client(this);
        }
    }


}
