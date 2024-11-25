package challengelv1kiosk;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

// TODO  부족한점 메서드안에서 객체 쓰는 법을 잘 모를는 듯? 너무 대충아는 느낌?
public class ShoppingCart {
    //필드
    List<MenuItem> ShoppingCartList = new ArrayList<>();

    //생성자
    ShoppingCart() {

    }


    //메서드
    // 만들기
    public void shoppingCartPutIn(MenuItem item) {
        ShoppingCartList.add(item);
    }

    // 지우기
    public void shoppingCartRemove(MenuItem... item) {
        ShoppingCartList.remove(item);
    }
    public List<MenuItem> getShoppingCartList(){
        return ShoppingCartList;
    }


    // 출력하기 - 합
    public void shoppingCartPrint() {
        Scanner sc = new Scanner(System.in);
        //  ShoppingCart shoppingCart = new ShoppingCart() // TODO 1. 오 세상에!!

        System.out.println("0. 메뉴로 돌아가기");
        System.out.println("1. 주문 내역 확인");
        System.out.println("2. 주문 하기");
        System.out.println("3. 주문 목록 취소하기");

        int selectNum = sc.nextInt();
        sc.nextLine();

        switch (selectNum) {
            case 1 -> {
                int i = 1;
                for (MenuItem item : ShoppingCartList) {
                    System.out.println(String.format("%2d. %10s |%6d |%-20s |", i, item.getMenuName(),
                            item.getPrice(), item.getExplain()));
                    i++;
                }
                this.shoppingCartPrint(); // TODO 1. 오 세상에!!

            }
            case 2 -> { // 합계 금액
                int tatalPrice = 0;
                for (int i = 0; i < ShoppingCartList.size(); i++) {
                    tatalPrice += ShoppingCartList.get(i).getPrice();
                    System.out.println(String.format("%2d. %10s |%6d |%-20s |", i+1, ShoppingCartList.get(i).getMenuName(),
                            ShoppingCartList.get(i).getPrice(), ShoppingCartList.get(i).getExplain()));

                }

                System.out.println("총합 금 : " + tatalPrice);
                System.out.println("주문 : 1");
                System.out.println("메인으로 : 0");
                int finalNum = sc.nextInt();
                sc.nextLine();
                if (finalNum == 1) {
                    System.out.println("완료되었습니다.");
                    ShoppingCartList.clear();
                } else if (finalNum == 0) {
                    System.out.println("주문이 취소되어 메인으로 돌아갑니다.");
                }
            }
            case 3 -> {
                try {

                    while (true) {
                        System.out.println("주문을 취소하려는 메뉴를 선택해 주세요");
                        int i = 1;
                        for (MenuItem item : ShoppingCartList) {
                            System.out.println(String.format("%2d. %10s |%6d |%-20s |", i, item.getMenuName(),
                                    item.getPrice(), item.getExplain()));
                            i++;
                        }
                        int selectRemove = sc.nextInt();
                        sc.nextLine();

                        ShoppingCartList.remove(ShoppingCartList.get(selectRemove - 1));

                        System.out.println("주문 목록을 재출력합니다.");
                        i = 1;
                        for (MenuItem item : ShoppingCartList) {
                            System.out.println(String.format("%2d. %10s |%6d |%-20s |", i, item.getMenuName(),
                                    item.getPrice(), item.getExplain()));
                            i++;
                        }
                        if(ShoppingCartList.size() == 0){
                            System.out.println("삭제 목록이 없어 메뉴페이지로 갑니다.");
                            break;
                        }
                        System.out.println("또 다른 메뉴를 취소하시려면 1");
                        System.out.println("메인으로 돌아가려면 0");
                        int select = sc.nextInt();
                        sc.nextLine();
                        if (select == 1) {
                            continue;
                        } else if (selectNum == 0) {
                            System.out.println("메뉴페이지로 갑니다.");
                            break;
                        }
                    }
                }
                    catch(InputMismatchException | IndexOutOfBoundsException e){
                        if (e instanceof InputMismatchException) {
                            System.out.println("InputMismatchException - 잘못된 타입의 입력 값");
                            sc.nextLine();
                        } else if (e instanceof IndexOutOfBoundsException) {
                            System.out.println("IndexOutOfBoundsException - 범위에 없는 값 입력");
                            sc.nextLine();

                        }
                    }
            }case 0 ->{
                System.out.println("메뉴로 돌아갑니다.");
            }
            default -> throw new IllegalStateException("Unexpected value: "+selectNum);

        }
    }


}
