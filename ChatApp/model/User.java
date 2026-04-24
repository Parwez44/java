package model;

import java.io.PrintWriter;

public class User {
    private String name;
    private PrintWriter out;

    public User(String name, PrintWriter out) {
        this.name = name;
        this.out = out;
    }

    public String getName() {
        return name;
    }

    public PrintWriter getOut() {
        return out;
    }
}