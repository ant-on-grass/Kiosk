package challengelv1kiosk;

public class Main {
    public static void main(String[] args) {

        // MenuItem 객체 생성
        MenuItem iceball = new MenuItem("iceball",2000,"very cold");
        MenuItem ballice = new MenuItem("ballice",2000,"very cold");
        MenuItem mal = new MenuItem("mal",2000,"very cold");
        MenuItem lam = new MenuItem("lam",2000,"very cold");

        // Menu 객체 생성
        Menu dessert = new Menu("dessert",iceball,ballice);
        Menu lammal = new Menu("lammal",mal,lam);

        // Kiosk 객체 생성
        Kiosk newkiosk = new Kiosk(dessert,lammal);

        // Kiosk start 메서드 호출
        newkiosk.start();






    }
}

