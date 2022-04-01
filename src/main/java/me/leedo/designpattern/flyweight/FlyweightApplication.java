package me.leedo.designpattern.flyweight;

public class FlyweightApplication {
    public static void main(String[] args) {
        /*
        * Flyweight 패턴의 구조에 복잡한 단어가 있어서 쉽게 이해하기가 어렵습니다
        * 디자인 패턴을 공부하는 이유는 이해하기 쉬운 구조를 만들기 위함이지
        * 남들이 못하는 걸 나만하기 위함이 아닙니다 (좋은 코드 패턴이 아닐 뿐더러 유지보수가 용이하지 않습니다)
        * 책, 인터넷, 영상 등 패턴의 코드, 클래스의 구조에 집착하기 보다는
        * 💍 Flyweight의 핵심인 object 공유를 통한 메모리 사용 감소에 집중하여
        * 유즈케이스에 따라 클래스 구조와 함수를 만들어서 활용할 수 있습니다
        * */


        // 📖 비트코인 거래소와 공유하기 위해 거래 가능한 코인들 목록을 만듭니다
        CryptoCurrencyTable cryptoCurrencyTable = new CryptoCurrencyTable();
        CryptoCurrency bitcoin = new CryptoCurrency("BTC", "비트코인", 50_000.0, "비트코인백서내용내용.....", "0xab07ab8d7.....");
        CryptoCurrency neo = new CryptoCurrency("NEO", "네오", 50_000.0, "네오코인백서백서내용.....", "0xab07ab8d7.....");
        CryptoCurrency ethereum = new CryptoCurrency("ETH", "이더리움", 50_000.0, "이더리움백서내용내용.....", "0xab07ab8d7.....");

        cryptoCurrencyTable.addCryptoCurrency(bitcoin);
        cryptoCurrencyTable.addCryptoCurrency(neo);
        cryptoCurrencyTable.addCryptoCurrency(ethereum);


        // 🎉 암호화폐 테이블을 거래소끼리 공유하여 메모리 사용량을 줄인다
        CryptoCurrencyExchange binance = new CryptoCurrencyExchange("US_BIN", "바이낸스", cryptoCurrencyTable);
        CryptoCurrencyExchange upbit = new CryptoCurrencyExchange("KR_UPB", "업비트", cryptoCurrencyTable);
        CryptoCurrencyExchange bithumb = new CryptoCurrencyExchange("KR_BIT", "빗썸", cryptoCurrencyTable);


        // ✅ 같은 암호화폐 테이블을 사용하는 지 확인합니다
        if (binance.getCryptoCurrencyTable() == upbit.getCryptoCurrencyTable()) {
            System.out.println("암호화폐 테이블을 공유합니다");
        } else {
            System.out.println("거래소마다 암호화폐 테이블을 따로 사용합니다");
        }

    }
}
