package com.nmit.beans;

public class Ticket {
    private static int counter = 0;
    private final int id;

    public Ticket() {
        this.id = ++counter;
        System.out.println("Ticket bean created, id = " + id);
    }

    public int getId() {
        return id;
    }
}
