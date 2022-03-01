package com.teksystems;

public class LeafPokemon extends Pokemon {

    public LeafPokemon(String name) {
        super(name);
    }

    @Override
    public String attack() {
        return super.name + " uses VINE WHIP!";
    }

}