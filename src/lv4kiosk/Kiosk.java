package lv4kiosk;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Kiosk {
    /**
     * kategoriebox - Menu 객체를 담는 그릇 변수
     */
    private List<Menu> kategoriebox = new ArrayList<>();

    /**
     * 매개변수
     *
     * @param menuObject kategoriebox에 담을 Menu 객체의 데이터
     */
    Kiosk(Menu... menuObject) {
        kategoriebox = List.of(menuObject);
    }

    /**
     * start 메서드
     * 카테고리의 선택과 해당 카테고리의 메뉴들을 출력
     */
    public void start() {
        Scanner sc = new Scanner(System.in);


        while (true) {
            System.out.println("카테고리 메뉴판");
            int i = 1;
            int selectKategorieSaver;
            for (Menu kategorie : kategoriebox) {
                System.out.println(String.format("%2d. %-10s", i, kategorie.getKategorieName()));
                i++;
            }
            try {
                System.out.println("카테고리를 선택하세요 0번을 누르면 종료합니다.");
                int selectKategorie = sc.nextInt();
                selectKategorieSaver = selectKategorie;
                sc.nextLine();

                if (selectKategorie != 0) {
                    kategoriebox.get(selectKategorie - 1).printMenuItems();
                } else if (selectKategorie == 0) {
                    System.out.println("선택을 종료합니다");
                    break;
                }
                System.out.println("메뉴를 선택합니다. 0번을 입력하면 카테고리 페이지로 이동합니다.");
                int selectMenu = sc.nextInt();
                sc.nextLine();
                if (selectMenu != 0) {
                    kategoriebox.get(selectKategorie - 1).getKategorieItem(selectMenu);
                } else if (selectMenu == 0) {
                    System.out.println("메뉴페이지로 갑니다.");
                    continue; // 현재로써는 필요가 없지만, 후에 기능 추가하면 필요
                }
            } catch (InputMismatchException | IndexOutOfBoundsException e) {
                if (e instanceof InputMismatchException) {
                    System.out.println("InputMismatchException - 잘못된 타입의 입력 값");
                    sc.nextLine();
                } else if (e instanceof IndexOutOfBoundsException) {
                    System.out.println("IndexOutOfBoundsException - 범위에 없는 값 입력");
                    sc.nextLine();

                }
            }


        }

    }
}
