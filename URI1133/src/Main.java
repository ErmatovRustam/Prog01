import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int x = scan.nextInt();
        int y = scan.nextInt();
        int i = 0;


        if (x < y) {

            for (i = x + 1; i < y; i++) {

                if (i % 5 == 2 || i % 5 == 3 || i % (-5) == 2 || i % (-5) == 3){
                    System.out.println(i);
                }
            }
        }
        if (y<x){
            for (i = y + 1; i < x; i++) {

                if (i % 5 == 2 || i % 5 == 3 || i % (-5) == 2 || i % (-5) == 3){
                    System.out.println(i);
                }
            }
        }

    }
}
