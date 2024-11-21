package lv3kiosk;

import java.util.ArrayList;
import java.util.List;

public class MenuItem {
    //필드
    /**
     * 필드
     * 각 필드 값을 정의
     *
     */
    // 키오스크
    // 혼종 ㄴ
    private List<String> menuItemList = new ArrayList<>() {
    };

    private String menuName;
    private int price;
    private String explain;
    private String menuItemStr;

    // 기본 생성자

    /**
     * 생성자
     * 생성자를 만들 때, 필요한 파라미터와 필드 초기값
     * @param menuName 넣을 이름 값
     * @param price 넣을 가격 값
     * @param explain 넣을 설명 값
     */
    MenuItem(String menuName, int price, String explain) {
        this.menuName = menuName;
        this.price = price;
        this.explain = explain;
        // 따로

    }

    public String getMenuName(){
        return menuName;
    }

    public int  getPrice(){
        return price;
    }

    public String  getExplain(){
        return explain;
    }


/*
    public static void printMenuItem(List<MenuItem> menuList) {
        String viewer;
        for (viewer : menuList) {
            System.out.println(viewer);
        }
    }
*/

/*


    menuItemStr = menuItemList.size() + 1 + ". " + menuName + " | $ : " + price + " | " + expain + " |";
        menuItemList.add(menuItemStr);
*/

}
