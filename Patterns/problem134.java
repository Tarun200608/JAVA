public class problem134 {
        public static void main(String[] args) {
            int a =5;
            for (int i = 0; i < a; i++) {
                char s ='A';
                for (int j = 0; j < i+1; j++) {
                    System.out.print((char)(s+i)+" ");
                }
                System.out.println();
            }
        }
}
