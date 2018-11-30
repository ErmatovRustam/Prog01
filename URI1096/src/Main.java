import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        int i = 1;
        int j = 7;

        while (i <= 9) {

            for(j=7; j>4; j--){
                System.out.printf("I=%d J=%d%n", i , j);
            }
            i+=2;


        }


    }
}

