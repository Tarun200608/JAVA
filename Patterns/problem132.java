public class problem132 {
        public static void main(String[] args) {
            int a =5;
            for (int i = 0; i <= a; i++) {
                for (int j = 0; j < a-i; j++) {
                    System.out.print(" ");

                }
                for (int k = i; k >=1 ; k--) {
                    System.out.print(k);

                }
                for (int l = 1; l <i+1; l++) {
                    if(l!=1){  
                        System.out.print(l);
                    }
                }

                System.out.println();
            }
        }
}
