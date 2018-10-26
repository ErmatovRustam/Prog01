import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Month? ");
        int m = scan.nextInt();

        String msg = "Fall";

        switch (m) {
            case 12:
            case 1:
            case 2:
                msg = "Winter";
                break;
            case 3:
            case 4:
            case 5:
                msg = "Spring";
                break;
            case 6:
            case 7:
            case 8:
                msg = "Summer";
                break;
            case 9:
            case 10:
            case 11:
                msg = "Winter";
                break;
                default:
                    msg= "Incorrect value";
                    break;


//        if (m > 12 || m < 1) {
//            msg = "Incorrect month: " + m;
//        } else if (m == 12 || m == 1 || m == 2) {
//            msg = "Winter";
//        } else if (m == 3 || m == 4 || m == 5) {
//            msg = "Spring";
//        } else if (m == 6 || m == 7 || m == 8) {
//            msg = "Summer";

        }
    }
}