import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int i = 0;
        int j = 0;

        for(j=1; j<=n; j++){
            int sum = 0;

            int pn = scan.nextInt();

            for(i=1; i<= (pn / 2); i++){

                if(pn % i==0){
                    sum +=i;

                }
            }
            if(sum == pn){
                System.out.println(pn + " eh perfeito");
            }else{
                System.out.println(pn + " nao eh perfeito");
            }
        }
    }
}
