public class problem69 {
        public static void main(String[] args) {
            int n =10;
            for (int i = 0; i < n; i++) {

                for (int j = i; j <n-1; j++) {
                    System.out.print(" ");
                }
                for (int k =0; k <2*i+1; k++) {
                    System.out.print("*");
                }
                System.out.println("");
            }
            // int n =10;
            // for (int i = 0; i < n; i++) {

            //     for (int j = i; j <n-1; j++) {
            //         System.out.print(" ");
            //     }
            //     for (int k = n-i; k <n; k++) {
            //         System.out.print("* ");
            //     }
            //     System.out.println("");
            // }
        }
}
