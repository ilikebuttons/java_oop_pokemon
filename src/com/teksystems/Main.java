package com.teksystems;

public class Main {

    public static void main(String[] args) {

        // Program at the ""interface"" defined in the superclass.
        // Declare instances of the superclass, substituted by subclasses.
        Pokemon m1 = new FirePokemon("Charmander"); // upcast
        Pokemon m2 = new WaterPokemon("Squirtle"); // upcast
        Pokemon m3 = new LeafPokemon("Bulbasaur"); // upcast

        // Invoke the actual implementation
        System.out.println(m1.attack()); // Run FireMonster&#39;s attack()
        System.out.println(m2.attack()); // Run WaterMonster&#39;s attack()
        System.out.println(m3.attack()); // Run StoneMonster&#39;s attack()

        // m1 dies, generate a new instance and re-assign to m1.
        System.out.println(m1.name + " fainted.");
        m1 = new LeafPokemon("Ivysaur"); // upcast
        System.out.println(m1.attack()); // Run StoneMonster&#39;s attack()

        // We have a problem here!!!
        Pokemon m4 = new Pokemon();
        System.out.println(m4.attack()); // garbage!!!
    }
}