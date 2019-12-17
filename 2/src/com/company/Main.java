package com.company;

import java.util.LinkedList;
import java.util.Objects;

public class Main {

    public static void main(String[] args) {
        LinkedList<Person> personLinkedList = new LinkedList<>();
        personLinkedList.add(new Person("a","b","c"));
        personLinkedList.add(new Person("a","b","c"));
        personLinkedList.add(new Person("a","b","c"));
        if(personLinkedList.get(0).equals(personLinkedList.get(1))){
            System.out.println("Person1=Person2");
        }else if(personLinkedList.get(0).equals(personLinkedList.get(2))) {
            System.out.println("Person1=Person3");
        }
        if(personLinkedList.get(1).equals(personLinkedList.get(0))){
            System.out.println("Person2=Person1");
        }else if(personLinkedList.get(1).equals(personLinkedList.get(2))){
            System.out.println("Person2=Person3");
        }
        if(personLinkedList.get(2).equals(personLinkedList.get(0))){
            System.out.println("Person3=Person1");
        }else if(personLinkedList.get(2).equals(personLinkedList.get(1))){
            System.out.println("Person3=Person2");
        }
    }
}
class Person{
    private String name;
    private String surname;
    private String otchestvo;

    public Person(String name, String surname, String otchestvo) {
        this.name = name;
        this.surname = surname;
        this.otchestvo = otchestvo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getOtchestvo() {
        return otchestvo;
    }

    public void setOtchestvo(String otchestvo) {
        this.otchestvo = otchestvo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return name.equals(person.name) &&
                surname.equals(person.surname) &&
                otchestvo.equals(person.otchestvo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, otchestvo);
    }
}
