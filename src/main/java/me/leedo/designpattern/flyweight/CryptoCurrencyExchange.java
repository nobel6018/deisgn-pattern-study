package me.leedo.designpattern.flyweight;

public class CryptoCurrencyExchange {

    private final String exchangeCode;  // 거래소코드
    private final String name;

    // ❌ 각 거래소마다 암호화폐 목록을 따로 관리하지 않고
    // private List<CryptoCurrency> cryptoCurrencyList;

    // ⭕️ 암호화폐 목록 테이블을 만들어 "공유"하여 메모리 사용량을 줄입니다
    private final CryptoCurrencyTable cryptoCurrencyTable;


    public CryptoCurrencyExchange(String exchangeCode, String name, CryptoCurrencyTable cryptoCurrencyTable) {
        this.exchangeCode = exchangeCode;
        this.name = name;
        this.cryptoCurrencyTable = cryptoCurrencyTable;
    }

    public CryptoCurrencyTable getCryptoCurrencyTable() {
        return cryptoCurrencyTable;
    }
}
