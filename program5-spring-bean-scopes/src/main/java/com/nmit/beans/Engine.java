package com.nmit.beans;

public class Engine {
    private final String type;

    public Engine(String type) {
        this.type = type;
        System.out.println("Engine bean created: " + type);
    }

    public String getType() {
        return type;
    }
}
