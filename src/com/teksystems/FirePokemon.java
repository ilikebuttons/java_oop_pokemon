package com.teksystems;

public class FirePokemon extends Pokemon {

    public FirePokemon(String name) {
        super(name);
    }

    @Override
    public String attack() {
        return super.name + " uses EMBER!";
    }
}