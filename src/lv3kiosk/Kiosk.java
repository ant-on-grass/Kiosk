package lv3kiosk;

import java.util.ArrayList;
import java.util.InputMismatchException;
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
     /*   Kiosk fixer = new Kiosk();
        int checker = 0;*/

        while(true) {
            System.out.println("메뉴판");
            int i = 1;
            for (MenuItem test : menuItemList) {
                System.out.println(String.format("%2d. %-10s", i, test.getMenuName()));
                i++;
            }
            try {
                // 1. while - > for - > try - > catch - > while ...
                // 2. while - > for - > try - > while ...
                System.out.println("보시려는 메뉴의 번호를 입력해주세요. 0을 입렵하면 종료합니다");
                int selectMenu = sc.nextInt();
                // < - 에러 난 곳에서 \n 이 남아있어서 try catch 가 안됨
                sc.nextLine();

                if (selectMenu != 0) {
                    System.out.println(String.format("%2d. %10s |%6d |%-20s |", selectMenu, menuItemList.get(selectMenu - 1).getMenuName(),
                            menuItemList.get(selectMenu - 1).getPrice(), menuItemList.get(selectMenu - 1).getExplain()));
                } else if (selectMenu == 0) {
                    System.out.println("선택을 종료합니다");
                    //checker = 1;
                    break;
                }
            }catch (InputMismatchException | IndexOutOfBoundsException e){
                if( e instanceof InputMismatchException){
                    System.out.println("InputMismatchException - 잘못된 타입의 입력 값");
                    sc.nextLine();
                    //break;
                }else if(e instanceof IndexOutOfBoundsException){
                    System.out.println("IndexOutOfBoundsException - 범위에 없는 값 입력");
                    sc.nextLine();
                    //break;
                }
            }
        }
   /*     if(checker != 1){
            fixer.start();
        }*/ // readme 추가할 내용 - 조잡하지만 해결하려한 결과물

    }
// InputMismatchException 잘못된 타입의 입력 값
// IndexOutOfBoundsException 범위에 없는 값 입력

// readme 추가할 내용 - 필드 안에서만 초기값 < - > 메서드는 값을 명시해줘야한다.
    //

}
