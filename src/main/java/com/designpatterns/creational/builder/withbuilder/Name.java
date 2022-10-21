package com.designpatterns.creational.builder.withbuilder;

import java.util.List;

public class Name {

    private String firstName;
    private String lastName;
    private List<String> middleNames;

    private Name(NameBuilder builder){
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
        this.middleNames = builder.middleNames;
    }

    public static NameBuilder builder(){
        return new NameBuilder();
    }

    public static class NameBuilder{
        private String firstName;
        private String lastName;
        private List<String> middleNames;

        public NameBuilder firstName(String firstName){
            this.firstName = firstName;
            return this;
        }
        public NameBuilder lastName(String lastName){
            this.lastName = lastName;
            return this;
        }
        public NameBuilder middleNames(List<String> middleNames){
            this.middleNames = middleNames;
            return this;
        }

        public Name build(){
            return new Name(this);
        }
    }
}
