import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int a = scan.nextInt();
        int b = scan.nextInt();

        if (a >= b) {
            System.out.printf("O JOGO DUROU %d HORA(S)%n", (24 - a + b));
        }
        if (a < b) {
            System.out.printf("O JOGO DUROU %d HORA(S)%n",(b - a));
        }
    }
}
