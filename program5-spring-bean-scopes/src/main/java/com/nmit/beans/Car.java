package com.nmit.beans;

public class Car {
    private final Engine engine;   // dependency
    private String model;

    public Car(Engine engine) {
        this.engine = engine;
        System.out.println("Car constructor: Engine dependency injected");
    }

    public void setModel(String model) {
        this.model = model;
    }

    // Lifecycle: called after the bean is created and wired
    public void init() {
        System.out.println("Car init(): bean initialised, model = " + model);
    }

    public void drive() {
        System.out.println(model + " is running with " + engine.getType() + " engine");
    }

    // Lifecycle: called just before the container destroys the bean
    public void cleanup() {
        System.out.println("Car cleanup(): bean is being destroyed");
    }
}
