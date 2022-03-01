package com.teksystems;

public class Pokemon {
    public String name;

    public Pokemon() {
        this("MissingNo.");
    }

    public Pokemon(String name) {
        this.name = name;
        System.out.println("A wild " + this.getClass().getSimpleName() + " named " + this.name + " appeared!");
    }

    public String attack() {
        return this.name + " used STRUGGLE!\n...It's not very effective!";
    }
}