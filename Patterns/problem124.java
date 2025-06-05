public class problem124 {
        public static void main(String[] args) {
                int a =5 ;
                for (int i = 0; i < a; i++) {
                    for (int j = 1; j < a-i; j++) {
                        System.out.print(" ");
                    }
                    int number =1;
                    for (int k = 0; k <=i; k++) {
                        System.out.print(number+" ");
                        number =number* (i-k)/(k+1);
                    }
                    System.out.println();
                }
        }
}
