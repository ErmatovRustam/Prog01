import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int i = 0;

        for (i = 1; i <= n; i++) {
            int m = scan.nextInt();

            if (m % 2 == 0 && m!=0){
                System.out.print("EVEN ");
            }
            if (m % 2 != 0 ){
                System.out.print("ODD ");
            }

            if (m > 0 ){
                System.out.println("POSITIVE");
            }
            if (m < 0 ){
                System.out.println("NEGATIVE");
            }

            if (m == 0 ){
                System.out.println("NULL");
            }

        }
    }
}
