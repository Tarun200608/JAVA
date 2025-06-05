public class problem108 {
        public static void main(String[] args) {
            int a =4  ;
            int n =5;
            for (int i = 0; i < n; i++) {

                for (int j = i; j <n-1; j++) {
                    System.out.print(" ");
                }
                for (int k =0; k <2*i+1; k++) {
                    System.out.print("*");
                }
                System.out.println();
            }
            for (int i = 0; i < a; i++) {
                for (int j = 0; j <i+1 ; j++) {
                    System.out.print(" ");
                }
                for (int k = 0; k <2*(a-i)-1; k++) {
                    System.out.print("*");
                }
                System.out.println();
            }
            // int n =5;
            // for (int i = 0; i <n; i++) {
                
            // }
        }
}
