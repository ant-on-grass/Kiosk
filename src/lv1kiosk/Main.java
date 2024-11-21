package lv1kiosk;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i =1;
        while (true) {
                System.out.print("메뉴명 , 0 을 입렵하면 종료합니다.");
                String menuName = sc.nextLine();

                if (!(menuName.equals("0"))) {
                    System.out.print("가격");
                    int menupPay = sc.nextInt();
                    sc.nextLine();
                    System.out.print("설명");
                    String menuExplain = sc.nextLine();
                    System.out.println(i + ". " + menuName + " | $ : " + menupPay + " | " + menuExplain + " |");
                    i++;
                } else if (menuName.equals("0")) {
                    System.out.println("프로그램을 종료합니다.");
                    break;
                }

        }
    }
}
