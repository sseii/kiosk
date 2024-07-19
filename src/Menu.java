package team1_kiosk;

public class Menu {
    // 이름, 설명 필드를 가지는 클래스
    protected String name;
    protected String explanation;

    public Menu(String name, String explanation) {
        this.name = name;
        this.explanation = explanation;
    }

    public String show() {
        return String.format("%-10s | %s", name, explanation);
    }
}
