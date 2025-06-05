import java.util.Scanner;

public class problem14 {
        public static void main(String[] args) {
            Scanner th = new Scanner(System.in);
            int a =th.nextInt();
            int b =th.nextInt();
            int c =th.nextInt();
            int d =th.nextInt();
            int e =th.nextInt();
            int f =th.nextInt();
            double avg = (a+b+c+d+e+f)/6;
            System.out.println("the average of first 6 numbers is:"+avg);
            th.close();
        }
}
