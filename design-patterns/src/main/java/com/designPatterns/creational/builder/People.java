package com.designPatterns.creational.builder;

public class People {
    public static void main(String[] args) {
        Name name = new Name.Builder().name("Anna")
                .surname("Arakelyan")
                .build();

        Account account = new Account.Builder().name(name)
                .id(15)
                .email("aarakelyan1998@gmail.com")
                .build();
    }
}
