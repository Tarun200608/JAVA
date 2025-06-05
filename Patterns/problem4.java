import java.util.Scanner;

public class problem4 {
        public static void main(String[] args) {
            Scanner th = new Scanner(System.in);
            System.out.println("enter the value of a:");
            int a = th.nextInt();
            System.out.println("enter the value of b:");
            int b = th.nextInt();
            System.out.println("the sum of the two numbers "+(a+b));
            th.close();
        }
}
