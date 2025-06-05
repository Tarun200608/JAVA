public class problem130 {
        public static void main(String[] args) {
            int a = 5;
            for (int i = 0; i < a; i++) {
                for (int j = 0; j < a; j++) {
                    if (i%2==0) {
                        if (j%2==0) {
                            System.out.print("1 ");
                        }
                        else{
                            System.out.print("0 ");
                        }
                    }
                    else{
                        if (j%2==0) {
                            System.out.print("0 ");
                        }
                        else{
                            System.out.print("1 ");
                        }
                    }
                }
                System.out.println();
            }
        }
}
