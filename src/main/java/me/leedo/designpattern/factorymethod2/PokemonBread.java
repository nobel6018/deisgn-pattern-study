package me.leedo.designpattern.factorymethod2;

public class PokemonBread implements Bread {
    private final String name;
    private String pokemon;

    public PokemonBread(String name) {
        this.name = name;
    }

    @Override
    public void info() {
        System.out.println("포켓몬 빵: " + name + ", 포켓몬: " + pokemon);
    }

    public void setPokemon(String pokemon) {
        this.pokemon = pokemon;
    }
}
