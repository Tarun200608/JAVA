public class problem129 {
        public static void main(String[] args) {
            int a =5;
            for(int i =0 ;i<a;i++){
                for (int j = 0; j <i+1; j++) {
                    if (j%2==0) {
                        System.out.print("1 ");
                    }
                    else {
                        System.out.print("0 ");
                    }
                }
                System.out.println();
            }
        }
}
