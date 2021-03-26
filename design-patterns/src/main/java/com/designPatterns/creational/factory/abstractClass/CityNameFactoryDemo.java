package com.designPatterns.creational.factory.abstractClass;

public class CityNameFactoryDemo {
    public static void main(String[] args) {
        CityNameFactory cityName = new CityNameFactory();

        CityName cityName1 = cityName.getCityName("London");
        cityName1.getName();

        CityName cityName2 = cityName.getCityName("Yerevan");
        cityName2.getName();

        CityName cityName3 = cityName.getCityName("Moscow");
    }
}
