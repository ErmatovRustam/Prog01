import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("A four-digit integer? ");

        int a = scan.nextInt();

        int fourth = a % 10;
        int third = ((a %100) - fourth)/ 10;
        int second = (((a % 1000)- fourth) / 100);
        

        System.out.println( fourth + third + second);


    }
}
