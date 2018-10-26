public class Main {

    public static void main(String[] args) {
        double s = 0.0;

        double x = 0.1;

        s+=x;
        s+=x;
        s+=x;
        s+=x;
        s+=x;
        s+=x;
        s+=x;
        s+=x;
        s+=x;
        s+=x;

 //     if (s==1.0){
 //         System.out.println("OK");
 //     }else{
 //         System.out.println("What?");
 //     }
        if (Math.abs(s - 1.0)> 1E-10  ){
            System.out.println("OK");
        }else{
            System.out.println("What?");
        }

    }
}
