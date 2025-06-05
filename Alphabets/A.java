package Alphabets;

public class A {
        public static void main(String[] args) {
            int a =18;
            for (int i = 0; i <a; i++) {
                for (int j = 0; j <a-i; j++) {
                    System.out.print(" ");
                }
                for (int k = 0; k <2*i+1; k++) {
                    if (i==a/2||k==0||k==2*i) {
                        System.out.print("A");
                    }
                    else{
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
        }
}
