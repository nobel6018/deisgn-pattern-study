package me.leedo.designpattern.factorymethod2;

import java.util.ArrayList;
import java.util.List;

public class PokemonBreadFactory implements BreadFactory {
    private final List<String> producedPokemons = new ArrayList<>();

    @Override
    public Bread createBread() {
        return createBread("피카츄"); // 피카츄가 기본 스티커
    }

    public Bread createBread(String pokemon) {
        PokemonBread bread = new PokemonBread("포켓몬 빵");
        bread.setPokemon(pokemon);
        producedPokemons.add(pokemon);

        return bread;
    }

    public List<String> getProducedPokemons() {
        return producedPokemons;
    }
}
