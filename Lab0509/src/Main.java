public class Main {

    public static void main(String[] args) {
        int i =0;
        int count = 0;


        for(i=100; i<=1000; i++){

            if((i% 5==0) || (i % 6==00 )){
                count++;

                if(count%10==0){
                    System.out.println(i);
                }
                else{
                    System.out.print(i + " ");
                }
            }
        }
    }
}
