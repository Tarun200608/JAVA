public class problem131 {
        public static void main(String[] args) {
            int a =5;
            for (int i = 1; i <=a; i++) {
                for (int j = 0; j < i+1; j++) {
                    System.out.print(" ");
                }
                for (int k = i; k <=a; k++) {
                    System.out.print(k+" ");
                }
                System.out.println();
            }
            for (int i = a-1; i >0; i-- ) {
                for (int j = 0; j < i+1; j++) {
                    System.out.print(" ");
                }
                for (int k = i; k <=a; k++) {
                    System.out.print(k+" ");
                }
                System.out.println();
            }
        }
}
