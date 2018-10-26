import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int i = 0;
        if (a % 2 == 1) {
            for (i = a; i <= a + 12; i += 2) {
                System.out.println(i);
            }
        } else {
            for (i = a + 1; i <= a + 12; i += 2) {
                System.out.println(i);
            }

        }
    }
}
