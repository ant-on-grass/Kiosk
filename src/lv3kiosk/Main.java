package lv3kiosk;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // 객체 생성
        MenuItem iceball = new MenuItem("iceball",2000,"very cold");
        MenuItem ballice = new MenuItem("ballice",2000,"very cold");

        Kiosk newkiosk = new Kiosk(iceball, ballice);

        // Kiosk 에 start 호출
        newkiosk.start();




    }
}
