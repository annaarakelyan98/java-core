package com.designPatterns.builder;

import lombok.Getter;

public class Name {
    @Getter
    private final String firstname;
    @Getter
    private final String surname;

    private Name(Builder builder) {
        this.firstname = builder.firstname;
        this.surname = builder.surname;
    }

    public static class Builder {
        private String firstname;
        private String surname;

        public Builder name(String firstname) {
            this.firstname = firstname;
            return this;
        }

        public Builder surname(String surname) {
            this.surname = surname;
            return this;
        }

        public Name build() {
            return new Name(this);
        }
    }
}
