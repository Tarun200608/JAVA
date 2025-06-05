public class problem114 {
        public static void main(String[] args) {
            int a =5;
            for (int i = a-1; i >0; i--) {
                for (int j = 0; j < a-i; j++) {
                    System.out.print(" ");
                }
                for (int k = 0; k <2*i+1; k++) {
                    System.out.print("*");
                }
                System.out.println();
            }
            for (int i = 0; i < a; i++) {
                for (int j = 0; j < a-i; j++) {
                    System.out.print(" ");
                }
                for (int k = 0; k <2*i+1; k++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }
}
