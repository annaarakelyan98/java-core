package com.designPatterns.creational.singleton.lazyPattern;

public class Lazy {
    private static Lazy obj;

    private Lazy() {
    }

    public static Lazy getObj() {
        if (obj == null) {
            obj = new Lazy();
        }
        return obj;
    }
}

//Thread Safe Singleton
class ThreadSafe {
    private static ThreadSafe instance;

    private ThreadSafe() {
    }

    public static synchronized ThreadSafe getInstance(){
        if (instance == null){
            instance = new ThreadSafe();
        }
        return instance;
    }
}
