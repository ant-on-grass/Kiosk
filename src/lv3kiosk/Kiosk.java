package lv3kiosk;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Kiosk {
    //필드
    /**
     * 필드
     * List<MenuItem> 타입의 menuItemList 객체 생성
     */
    List<MenuItem> menuItemList = new ArrayList<>() ;


    //생성자
    /**
     * 생성자
     *
     * @param menuItems 각종 메뉴객체
     */
    Kiosk (MenuItem ...menuItems){
        menuItemList = List.of(menuItems);
    }
    // 인자를 여러개 받겠다.

    /**
     *  start 메서드
     *  메뉴의 총괄 관리 - 생성과 사용자에 인터페이스
     */
    //메서드
    public void start(){
        Scanner sc = new Scanner(System.in);

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
