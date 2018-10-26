import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Month? ");
        int choice = scan.nextInt();
        String msg = "";


        switch (choice) {
            case 4:
            case 5:
                msg = "You are Pro";
                break;
            case 2:
            case 3:
                msg = "exper";
                break;
            case 1:
                msg = "beg";
                break;
            case 0:
                msg = "good luck";
                break;
            default:
                msg = "doent have this value value" + choice;
                break;}

        System.out.println(msg);


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