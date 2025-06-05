import java.util.*;

public class errors {
    public static void main(String[] args) {
        int a[] = new int[4];
        a[0] = 1;
        a[1] = 8;
        a[2] = 7;
        a[3] = 5;
        Boolean flag = true;
        // System.out.println("enter the number yuou should sustrate");
        // int div=sc.nextInt();
        // try{
        // System.out.println(a[num]/div);
        // }
        // catch(ArrayIndexOutOfBoundsException e){
        // System.out.println("The error is "+e);
        // }
        // catch(ArithmeticException e){
        // System.out.println("The error is "+e);
        // }
        // catch(Exception e){
        // System.out.println("The error is "+e);
        // }
        // System.out.println("End of the program");
        while (flag) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the array index ");
            int num = sc.nextInt();
            try {
                System.out.println("Welcome to video 82");
                try {
                    System.out.println(a[num]);
                    flag = false;
                } catch (ArrayIndexOutOfBoundsException e) {
                    System.out.println("Soory the index is not defined");
                }
            } catch (Exception e) {
                System.out.println("Execiption is occured");
            }
        }
    }
}
