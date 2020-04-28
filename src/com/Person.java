package com ;
public class Person {
    String firstName ;
    String lastName ; 

    public Person() {
    }

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
    
    public void setName(String firstName, String lastName ){
        this.firstName = firstName;
        this.lastName = lastName;
    }
    
    @Override
    public String toString () {
        return "" ;
    }
}
