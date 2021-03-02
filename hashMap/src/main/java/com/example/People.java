package com.example;

import java.util.Objects;

public class People {

    private String name;
    private int age;

    People(String n, int a) {
        this.name = n;
        this.age = a;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String toString() {
        return getName();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        People people = (People) o;
        return age == people.age && name.equals(people.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}