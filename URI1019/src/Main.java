import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int input = scan.nextInt();
        int hour = input / 3600;
        int minute = (input - (hour * 3600)) / 60;
        int second = (input - hour * 3600 - minute * 60);
        System.out.println(hour + ":" + minute + ":" + second);

    }
}
