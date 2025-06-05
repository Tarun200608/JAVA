public class problem115 {
        public static void main(String[] args) {
            int b =6;
            for (int i = 0; i < b; i++) {
                for (int j = 0; j < b-i; j++) {
                    System.out.print(" ");
                }
                for (int k = 0; k <2*i+1; k++) {
                    if(i==b-1||k==0||k==2*i){
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
