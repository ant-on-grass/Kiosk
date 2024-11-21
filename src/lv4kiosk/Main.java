package lv4kiosk;

public class Main {
    public static void main(String[] args) {


        MenuItem iceball = new MenuItem("iceball",2000,"very cold");
        MenuItem ballice = new MenuItem("ballice",2000,"very cold");

        Kiosk newkiosk = new Kiosk(iceball, ballice);

        newkiosk.start();




    }
}
