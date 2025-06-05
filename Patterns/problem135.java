public class problem135 {
        public static void main(String[] args) {
            int a =5;
            for (int i = 0; i <a; i++) {
                char s = 'A';
                for (int j = 0; j <a-i; j++) {
                    System.out.print(" ");
                }
                for (int k = 0; k <i+1 ; k++) {
                    System.out.print((char)(s+k)+" ");
                }
                System.out.println();
            }
        }
}
