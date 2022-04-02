package me.leedo.designpattern.flyweight;

public class CryptoCurrency {

    private final String code;
    private final String name;
    private final Double usd;
    private final String whitePaperPdf;  // 100MB
    private final String thumbnail;  // 10MB
    // 코인 하나 당 약 110MB -> 100개의 코인이 있다고 가정하면 -> 11GB
    // Macbook M1 16인치 기본형 모델의 메모리가 16GB

    // 각 거래소마다 100개의 코인을 따로 가지고 있으면 메모리 사용 용량이 계속 늘어납니다.
    // 💡 거래소마다 코인 목록을 각각 가지지 않고,
    // 코인 목록을 하나 만들어서 모든 거래소가 공유하면 됩니다.

    public CryptoCurrency(String code, String name, Double usd, String whitePaperPdf, String thumbnail) {
        this.code = code;
        this.name = name;
        this.usd = usd;
        this.whitePaperPdf = whitePaperPdf;
        this.thumbnail = thumbnail;
    }
}
