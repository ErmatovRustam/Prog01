import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int i = 1;
        int n = 7;

        while (i <= 9) {

            for(int j = n; j> n-3; j--){
                System.out.printf("I=%d J=%d%n", i , j);
            }
            i +=2;
            n +=2;
        }
    }
}

