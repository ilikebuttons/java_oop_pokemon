package com.teksystems;

public class WaterPokemon extends Pokemon {

    public WaterPokemon(String name) {
        super(name);
    }

    @Override
    public String attack() {
        return super.name + " uses BUBBLE!";
    }
}