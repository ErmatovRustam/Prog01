import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int i = 0;
        int j = 0;
        int n = scan.nextInt();
        int[][] ar = new int[n][n];

        for(i=0; i<ar.length; i++){
            for(j=0; j<ar.length; j++){
                if(i==j){
                ar[i][j]= 2;
                }
                System.out.println(ar[i][j]);
            }

        }


    }
}
