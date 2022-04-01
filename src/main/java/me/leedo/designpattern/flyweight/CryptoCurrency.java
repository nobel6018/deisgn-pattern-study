package me.leedo.designpattern.flyweight;

public class CryptoCurrency {

    String code;  // 암호화폐 코드
    String name;
    Double usd;
    String whitePaperPdf;  // 100MB
    String thumbnail;  // 10MB
    // 110MB -> 100개의 코인 -> 11GB
    // Macbook M1 16인치 기본형 모델의 메모리가 16GB

    // 각 거래소마다 100개의 코인을 따로 가지고 있으면 메모리 용량이 무한히 늘어날 수 있다.
    // 💡 거래소마다 코인 관리 내역을 각각 관리하지 말고
    // 코인 관리 내역을 공유하면 된다

    public CryptoCurrency(String code, String name, Double usd, String whitePaperPdf, String thumbnail) {
        this.code = code;
        this.name = name;
        this.usd = usd;
        this.whitePaperPdf = whitePaperPdf;
        this.thumbnail = thumbnail;
    }
}
