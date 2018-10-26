import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while (true) {
            int x = scan.nextInt();
            int y = scan.nextInt();

            if (x == 0 || y == 0){
                break;
            }

            if (x > 0 && y > 0) {
                System.out.println("primeiro");
            }
            if (x > 0 && y < 0) {
                System.out.println("quarto");
            }
            if (x < 0 && y < 0) {
                System.out.println("terceiro");
            }
            if (x < 0 && y > 0) {
                System.out.println("segundo");
            }
        }
    }
}
