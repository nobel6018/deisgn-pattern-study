package me.leedo.designpattern.flyweight;

import java.util.ArrayList;
import java.util.List;

public class CryptoCurrencyTable {

    List<CryptoCurrency> cryptoCurrencyList = new ArrayList<>();

    public void addCryptoCurrency(CryptoCurrency cryptoCurrency) {
        cryptoCurrencyList.add(cryptoCurrency);
    }
}
