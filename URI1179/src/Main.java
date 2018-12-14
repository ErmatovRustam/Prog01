import java.util.*;
public class Main {

    public static void main(String[] args) {
        int evenArray [] = new int [15];
        int oddArray [] = new int [15];
        Scanner scn = new Scanner(System.in);
        int sumOfEven = 0;
        int sumOfOdd = 0;
        int firstArrayIndex = 0;
        int secondArrayIndex = 0;

        for(int i = 0; i < 15; i++) {
            int number = scn.nextInt();

            if (number % 2 == 0) {

                evenArray [firstArrayIndex] = number;
                firstArrayIndex++;
                sumOfEven++;
                if (sumOfEven == 5) {
                    sumOfEven = 0;
                    firstArrayIndex = 0;
                    for(int j = 0; j < 5; j++ ) {
                        System.out.format("par[%d] = %d\n", j, evenArray [j]);
                    }
                }

            }
            else {
                oddArray [secondArrayIndex] = number;
                secondArrayIndex++;
                sumOfOdd++;
                if (sumOfOdd == 5) {
                    for(int j = 0; j < 5; j++ ) {
                        System.out.format("impar[%d] = %d\n", j, oddArray [j]);
                    }
                    sumOfOdd = 0;
                    secondArrayIndex = 0;
                }
            }
        }
        for(int j = 0; j < sumOfOdd; j++ ) {
            System.out.format("impar[%d] = %d\n", j, oddArray [j]);
        }

        for(int j = 0; j < sumOfEven; j++ ) {
            System.out.format("par[%d] = %d\n", j, evenArray [j]);
        }
    }
}










