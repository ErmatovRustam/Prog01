import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int i = 0;
        int a, b;


        while (((a = scan.nextInt()) > 0) && ((b = scan.nextInt()) > 0)) {

            int sum = 0;

            if(a>b){
                for (i=b; i <=a; i++){
                    sum +=i;
                    System.out.print(i + " ");

                }
            }else {
                for (i=a; i<=b; i++){
                    sum +=i;
                    System.out.print(i + " ");

                }
            }

            System.out.println("Sum=" + sum);
        }
    }
}
