package lv5kiosk;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Menu {
    /**
     * 필드
     * List<MenuItem> 타입의 menuItemList 객체 생성
     * List<String > 타입의 카테고리를 담는 변수 생성
     */
    private List<MenuItem> menuItemList = new ArrayList<>() ;
    private List<List<MenuItem>> menuKategorie = new ArrayList<>();
    private String kategorieName;

    /**
     *  매개변수
     *
     * @param kategorieStr 카테고리의 이름 값
     * @param menuItems Menu 객체에 담을 메뉴 정보들
     */
    Menu (String kategorieStr, MenuItem...menuItems){
        menuItemList = List.of(menuItems);
        kategorieName = kategorieStr;
    }

    /**
     * getter 메서드
     * 카테고리 이름을 가지고 옴
     * @return kategorieName
     */
     public String getKategorieName() {

         return kategorieName;
     }
    /**
     * 메서드
     * 해당 카테고리 객체이 아이템 정보를 출력함
     *
     */
    public void getKategorieItem (int selectNum){
        System.out.println(String.format("%2d. %10s |%6d |%-20s |", selectNum, menuItemList.get(selectNum - 1).getMenuName(),
                menuItemList.get(selectNum - 1).getPrice(), menuItemList.get(selectNum - 1).getExplain()));
    }

    /**
     * 해당 카테고리에 메뉴정보를 출력해주는 메서드
     *
     */
    public void printMenuItems(){
        Scanner sc = new Scanner(System.in);
        int i = 1;
            for (MenuItem test : menuItemList) {
                System.out.println(String.format("%2d. %10s |%6d |%-20s |", i, menuItemList.get(i - 1).getMenuName(),
                        menuItemList.get(i - 1).getPrice(), menuItemList.get(i - 1).getExplain()));
                i++;
            }

        }
    }

