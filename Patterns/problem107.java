public class problem107 {
        public static void main(String[] args) {
            int a =5;
            for (int i = 0; i < a; i++) {
                for (int j = 0; j <i+1 ; j++) {
                    System.out.print(" ");
                }
                for (int k = 0; k <2*(a-i)-1; k++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }
}
