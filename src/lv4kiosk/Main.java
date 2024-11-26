package lv4kiosk;

public class Main {
    public static void main(String[] args) {

        //객체 생성
        MenuItem iceball = new MenuItem("iceball",2000,"very cold");
        MenuItem ballice = new MenuItem("ballice",2000,"very cold");

        Menu dessert = new Menu("dessert",iceball,ballice);

        Kiosk newkiosk = new Kiosk(dessert);

        // Kiosk 에 start 호출
        newkiosk.start();






    }
}
