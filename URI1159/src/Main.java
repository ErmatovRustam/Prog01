import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        int i = 0;
        int n;

        while ((n = scan.nextInt()) != 0) {
            int sum = 0;
            if (n % 2 != 0) {

                for (i = n + 1; i <= n + 10; i += 2) {
                    sum += i;

                }
            }else{
                for(i=n; i <=n+9; i+=2){
                    sum +=i;

                }
            }
            System.out.println(sum);
        }
    }
}
