package challengeLv1kiosk;

import java.util.ArrayList;
import java.util.List;

public class MenuItem {
    //필드
    /**
     * 필드
     * 각 필드 값을 정의
     *
     */
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
    }

    /**
     * getter 메서드
     * menuName을 가지고옴
     * @return menuName
     */
    public String getMenuName(){
        return menuName;
    }

    /**
     * getter 메서드
     * price을 가지고옴
     * @return price
     */
    public int  getPrice(){
        return price;
    }

    /**
     * getter 메서드
     * explain을 가지고옴
     * @return explain
     */
    public String  getExplain(){
        return explain;
    }

    /**
     * setter 메서드
     * MenuItem 맴버 필드의 값을 변경
     */
    public  void setItemInformation(String chageMenuName, int chagePrice, String chageExplain){
        this.menuName = chageMenuName;
        this.price = chagePrice;
        this.explain = chageExplain;
    }

}
