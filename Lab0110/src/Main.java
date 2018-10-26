import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = 312032486;

        int birth = (int) (31536000.00 / 7);
        int death = (int) (31536000.00 / 13);
        int immig = (int) (31536000.00 / 43);

        int i = 0;

        for (i=1; i <=5; i++){
            n = n + birth +  immig - death;
            System.out.println(n);
        }


    }
}
