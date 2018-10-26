import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int allNum = scan.nextInt();
        int i = 0;
        int sumIn = 0;
        int sumOut = 0;


        for (i = 1; i <= allNum; i++) {
            int a = scan.nextInt();

            if (10 <= a && a <= 20) {
                sumIn += 1;
                sumOut = allNum - sumIn;
            }
        }

        System.out.println(sumIn + " in");
        System.out.println(sumOut + " out");
    }
}
