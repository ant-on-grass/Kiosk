package challengeLv1kiosk;

public class Main {
    public static void main(String[] args) {


        MenuItem iceball = new MenuItem("iceball",2000,"very cold");
        MenuItem ballice = new MenuItem("ballice",2000,"very cold");

        Menu dessert = new Menu("dessert",iceball,ballice);

        Kiosk newkiosk = new Kiosk(dessert);

        newkiosk.start();






    }
}
