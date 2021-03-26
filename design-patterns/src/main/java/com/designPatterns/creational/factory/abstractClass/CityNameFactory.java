package com.designPatterns.creational.factory.abstractClass;

public class CityNameFactory {
    public CityName getCityName(String name) {
        if (name == null) {
            return null;
        }
        if (name.equalsIgnoreCase("Yerevan")) {
            return new Yerevan();
        } else if (name.equalsIgnoreCase("LONDON")) {
            return new London();
        } else {
            System.out.println("Not this city");
        }
        return null;
    }
}
