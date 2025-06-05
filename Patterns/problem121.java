public class problem121 {
        public static void main(String[] args) {
            int a = 6;
            for (int i = 0; i < a-1; i++) {
                for (int j = 0; j < a-i; j++) {
                    System.out.print(" ");
                }
                for (int k = 0; k < 2*i+1; k++) {
                    if (k==0||k==2*i) {
                        System.out.print("*");
                    }
                    else{
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
            for (int i = a-1; i >= 0; i--) {
                for (int j = 0; j < a-i; j++) {
                    System.out.print(" ");
                }
                for (int k = 0; k < 2*i+1; k++) {
                    if (k==0||k==2*i) {
                        System.out.print("*");
                    }
                    else{
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
        }
}
