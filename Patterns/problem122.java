public class problem122 {
        public static void main(String[] args) {
            int a =5;
            for (int i = 1; i <= a; i++) {
                for (int j = 1; j < i+1; j++) {
                    System.out.print(j);
                }
                System.out.println();
            }
        }
}
