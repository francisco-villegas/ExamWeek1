package com.example.francisco.examweek1;

/**
 * Created by FRANCISCO on 07/08/2017.
 */

public class SingletonClass {

    private static SingletonClass instance = null;
    // variable of type String
    public String s;

    protected SingletonClass() {
        s = "Hello I am a string part of Singleton class";
    }

    // Lazy Initialization (If required then only)
    public static SingletonClass getInstance() {
        if (instance == null) {
            // Thread Safe.
            synchronized (SingletonClass.class) {
                if (instance == null) {
                    instance = new SingletonClass();
                }
            }
        }
        return instance;
    }
}