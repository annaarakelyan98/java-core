package com.designPatterns.creational.builder;
//builder design pattern uses for
// creating objects by using build
// method and does not creat many
// constructors, only uses method.
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
