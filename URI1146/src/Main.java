import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        int i = 0;
        int x;

        while (( x = scan.nextInt()) != 0){
            for (i = 1; i <= x; i++) {
                if(i==x){
                    System.out.print(i + "\n");
                }else{
                System.out.print(i + " ");
            }
        }


    }
}
