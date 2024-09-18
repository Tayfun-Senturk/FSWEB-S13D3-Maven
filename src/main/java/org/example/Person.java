package org.example;

public class Person {
    String firstname;
    String lastName;
    int age;
    String nationality;
    int Savings;

    public Person(String firstname, String lastName, int age) {
        this.firstname = firstname;
        this.lastName = lastName;
        this.age = age;
    }

    public Person(String firstname, String lastName, int age, String nationality, int Savings) {
        this(firstname, lastName, age);
        this.nationality = nationality;
        this.Savings = Savings;
    }

    public String getFirstName() {
        return this.firstname;
    }

    public String getLastName() {
        return this.lastName;
    }

    public Integer getAge() {
        return this.age;
    }

    public boolean isTeen() {
        return this.age < 20 && this.age > 12;
    }
}