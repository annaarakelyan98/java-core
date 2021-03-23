package com.designPatterns.creational.singleton.eagerPattern;

//eager instantiation
public class Eager {
    private static Eager obj = new Eager();

    private Eager() {
    }

    public static Eager getInstance() {
        return obj;
    }

    public void string() {
        System.out.println("Hello java");
    }
}

//by static block
class Eager1 {
    private static Eager1 obj;

    private Eager1() {
    }

    static {
        try {
            obj = new Eager1();
        } catch (RuntimeException exc) {
            System.out.println("throws runtime exception");
        }
    }

    public static Eager1 getObj() {
        return obj;
    }
}
