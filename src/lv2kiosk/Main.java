package lv2kiosk;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 객체 선언 및 생성
        List<MenuItem> menuItemList = new ArrayList<>() ;

        MenuItem iceball = new MenuItem("iceball",2000,"very cold");
        menuItemList.add(iceball);

        MenuItem ballice = new MenuItem("ballice",2000,"very cold");
        menuItemList.add(ballice);
        Scanner sc = new Scanner(System.in);

        // 구동 파트
       while(true) {
           System.out.println("메뉴판");
           int i = 1;
           for (MenuItem test : menuItemList) {
                System.out.println(String.format("%2d. %-10s", i, test.getMenuName()));
                i++;
            }

            System.out.println("보시려는 메뉴의 번호를 입력해주세요. 0을 입렵하면 종료합니다");
            int selectMenu = sc.nextInt();
            sc.nextLine();

            if(selectMenu != 0){
                System.out.println(String.format("%2d. %10s |%6d |%-20s |", selectMenu, menuItemList.get(selectMenu-1).getMenuName(),
                        menuItemList.get(selectMenu-1).getPrice(),menuItemList.get(selectMenu-1).getExplain()));
            }else if(selectMenu == 0){
                System.out.println("선택을 종료합니다");
                break;
            }
        }


    }
}
