import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        scan.next();
        int begD = scan.nextInt();
        int begH = scan.nextInt();
        scan.next();
        int begM = scan.nextInt();
        scan.next();
        int begS = scan.nextInt();

        scan.next();
        int endD = scan.nextInt();
        int endH = scan.nextInt();
        scan.next();
        int endM = scan.nextInt();
        scan.next();
        int endS = scan.nextInt();


        int beginS = ((begD * 24 * 60 * 60) + (begH * 60 * 60) + (begM * 60) + begS);
        int endingS = ((endD * 24 * 60 * 60) + (endH * 60 * 60) + (endM * 60) + endS);

        int durationS = endingS - beginS;

        int day = durationS / 60 / 60 / 24;
        int hour = (durationS - day * 24 * 60 * 60) / 60 / 60;
        int min = (durationS - (hour * 60 * 60 + day * 24 * 60 * 60)) / 60;
        int sec = (durationS - (day * 24 * 60 * 60 + hour * 60 * 60 + min * 60));


        System.out.printf("%d dia(s)\n", day);
        System.out.printf("%d hora(s)\n", hour);
        System.out.printf("%d minuto(s)\n", min);
        System.out.printf("%d segundo(s)\n", sec);

    }
}
