package com.designPatterns.creational.builder;

import lombok.Getter;

public class Account {
    @Getter
    private final String email;
    @Getter
    private final int id;
    @Getter
    private final Name name;

    private Account(Builder builder) {
        this.email = builder.email;
        this.id = builder.id;
        this.name = builder.name;
    }

    public static class Builder {
        private String email;
        private int id;
        private Name name;

        public Builder email(String mail) {
            this.email = mail;
            return this;
        }

        public Builder id(int id) {
            this.id = id;
            return this;
        }

        public Builder name(Name name) {
            this.name = name;
            return this;
        }

        public Account build() {
            return new Account(this);
        }
    }
}
