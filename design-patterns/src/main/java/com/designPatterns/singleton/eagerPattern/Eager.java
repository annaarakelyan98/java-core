package com.designPatterns.singleton.eagerPattern;

//eager instantiation
public class Eager {
    private static Eager obj = new Eager();

    private Eager() {
    }

    public static Eager getObj() {
        return obj;
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
