package com.angelozero.java20.java_16;

public class InstanceOf {
    @Deprecated
    public void oldInstanceOf(Object obj) {
        if (obj instanceof String) {
            String value = (String) obj;
            System.out.println("\nThe value " + value + "is a String");
        } else {
            System.out.println("\nThe value " + obj.toString() + "isn`t a String");
        }
    }

    public void newInstanceOf(Object obj) {
        if (obj instanceof String value) {
            System.out.println("\nThe value " + value + "is a String");
        } else {
            System.out.println("\nThe value " + obj.toString() + "isn`t a String");
        }
    }
}
