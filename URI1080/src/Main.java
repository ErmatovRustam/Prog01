import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        int i = 0;
        int max =0;
        int sum = 0;


        for (i = 1; i <= 100; i++) {
            int n = scan.nextInt();

            if (max<=n){
                max= n;
                sum = i;
            }

        }
        System.out.println(max);
        System.out.println(sum);
    }
}
