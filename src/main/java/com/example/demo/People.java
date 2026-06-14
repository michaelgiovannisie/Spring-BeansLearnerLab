package com.example.demo;

import java.util.ArrayList;
import java.util.List;

public abstract class People<PersonType extends Person> implements Iterable<PersonType>{
    List<PersonType> personList;

    public People(List<PersonType> personlList) {
        this.personList = personlList;
    }

    public People(PersonType... people) {
        personList = new ArrayList<PersonType>();

        for (PersonType person : people) {
            personList.add(person);
        }
    }

    public void add(PersonType person) {
        personList.add(person);
    }

    public void remove(PersonType person) {
        personList.remove(person);
    }

    public int size() {
        return personList.size();
    }

    public void clear() {
        personList.clear();
    }

    public void addAll(Iterable<PersonType> person) {
        for(PersonType x : person) {
            personList.add(x);
        }
    }

    public PersonType findById(long id) {
        for(PersonType x: personList) {
            if(x.getId() == id) {
                return x;
            }
        }
        return null;
    }

    public List<PersonType> findAll() {
        return personList;
    }

}
