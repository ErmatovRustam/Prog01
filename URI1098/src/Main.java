import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

//    double i = 0;
//    double n = 1;

//    while (i <= 2.0) {

//        for(double j = n; j< n+3; j++){
//            if (i == 0 || i == 1 || i == 2) {
//                System.out.printf("I=%d J=%d\n", (int)i, (int)j);
//            } else {
//                System.out.printf("I=%.1f J=%.1f%n", i, j);
//            }
//        }
//        i +=0.2;
//        n +=0.2;
//    }



        double j;
        double i = 0;

        for (j = 10; j <= 30; j += 10) {
            j /= 10.0;

            System.out.printf("I=%.1f J=%.1f%n", i, j);
            j += 2;
            i += 0.2;
        }
    }

}


