package kiosk;

import java.text.SimpleDateFormat;
import java.util.Date;

import java.util.Scanner;

public class Kiosk_Management {
    private Order[] orderQueue;
    private int orderCounter;

    public Kiosk_Management() {
        this.orderQueue = new Order[100];
        this.orderCounter = 0;
    }

    public void addOrder(Order order) {
        orderQueue[orderCounter] = order;
        orderCounter++;
    }

    public void printOrderQueue() {
        Scanner sc = new Scanner(System.in);
        // 대기주문 목록 출력
        System.out.println("[ 대기 주문 목록 ]");
        for (int i = 0; i < orderCounter; i++) {
            System.out.println("====================================");
            Order order = orderQueue[i];
            System.out.println("대기 번호: " + (i + 1));
            System.out.println("주문 상품 목록:");
            for (Product product : order.orderList) {
                if (product != null && product.num > 0) {
                    System.out.println("  - " + product.cartShow());
                }
            }
            System.out.println("주문 총 가격: W " + order.sum);
            System.out.println("요청 사항: 없음"); // 요청사항 마지막 개선부분하면서 추가
            System.out.println("주문 일시: " + new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date()));
            System.out.println("====================================");

            //주문 완료처리 일단 하긴했는데 이게 아닌거 같긴함.. 지워도 됨
            System.out.println("위 주문을 완료했습니까?(y/n)");
            String str = sc.next();
            if(str.equals("y")){
                orderQueue[i] = null;
            }else if(str.equals("n")){
                //
            }
        }
    }


    public void mainShow() {
        Scanner sc = new Scanner(System.in);
        Kiosk_Management km = new Kiosk_Management();
        System.out.println("[ MANAGEMENT MENU ]");
        System.out.println("1.대기주문 목록");
        System.out.println("2.완료주문 목록");
        System.out.println("3.상품 생성");
        System.out.println("4.상품 삭제");
    }
}
