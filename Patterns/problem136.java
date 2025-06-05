public class problem136 {
        public static void main(String[] args) {
            int a =5;
            for (int i = 0; i < a-1; i++) {
                char s ='A';
                for (int j = 0; j < a-i; j++) {
                    System.out.print((char)(s+j)+" ");
                }
                System.out.println();
            }
            for (int i = a-1; i>=0; i--) {
                char s ='A';
                for (int j = 0; j < a-i; j++) {
                    System.out.print((char)(s+j)+" ");
                }
                System.out.println();
            }
        }
}
