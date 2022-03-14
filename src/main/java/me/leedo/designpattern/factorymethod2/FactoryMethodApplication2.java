package me.leedo.designpattern.factorymethod2;

import java.util.List;

public class FactoryMethodApplication2 {
    public static void main(String[] args) {
        ParisBaguetteBreadFactory parisBaguetteBreadFactory = new ParisBaguetteBreadFactory();
        PokemonBreadFactory pokemonBreadFactory = new PokemonBreadFactory();

        // 파바빵 생산
        Bread parisBread1 = parisBaguetteBreadFactory.createBread();
        parisBread1.info();

        // 🥖파바빵 공장 특화 기능1: 선물 포장 가능
        Bread parisBread2 = parisBaguetteBreadFactory.createBread(true);
        parisBread2.info();

        // 🥖파바빵 공장 특화 기능2: 선물 포장 개수 확인
        int giftWrappedCount = parisBaguetteBreadFactory.getGiftWrappedCount();
        System.out.println("giftWrappedCount = " + giftWrappedCount);

        // 포켓몬빵 생산
        Bread pokemonBread1 = pokemonBreadFactory.createBread();
        pokemonBread1.info();

        // ⚡️포켓몬빵 공장 특화 기능1: 포켓몬 스티커 선택
        Bread pokemonBread2 = pokemonBreadFactory.createBread("뮤");
        pokemonBread2.info();

        // ⚡️포켓몬빵 공장 특화 기능2: 생상된 포켓몬 스티커 확인
        List<String> producedPokemons = pokemonBreadFactory.getProducedPokemons();
        System.out.println("producedPokemons = " + producedPokemons);
    }
}
