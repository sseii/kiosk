package team1_kiosk;

public class Product extends Menu {
    // 이름, 가격, 설명 필드를 가지는 클래스
    public double price;
    public int num = 0;

    public Product(String name, double price, String explanation) {
        super(name, explanation);
        this.price = price;
    }

    @Override
    public String show() {
        return String.format("%-20s | W %-5.1f| %s", name, price, explanation);
    }

    public String cartShow() {
        return String.format("%-20s | W %-5.1f| %d개 | %s", name, price, num, explanation);
    }
}
