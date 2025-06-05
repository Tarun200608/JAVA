public class problem137 {
        public static void main(String[] args) {
            int a =5;
            for (int i = 0; i <a-1; i++) {
                char s ='A';
                for (int j = 0; j < a-i; j++) {
                    System.out.print(" ");
                }
                for (int k = 0; k<=2*i+1 ; k++) {
                    if(k==2*i||k==0){
                        System.out.print((char)(s+i));
                    }
                    else{
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
            for (int i = a-1; i >=0; i--) {
                char s ='A';
                for (int j = 0; j < a-i; j++) {
                    System.out.print(" ");
                }
                for (int k = 0; k<=2*i+1 ; k++) {
                    if(k==2*i||k==0){
                        System.out.print((char)(s+i));
                    }
                    else{
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
        }
}
