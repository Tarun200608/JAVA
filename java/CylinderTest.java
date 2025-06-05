public class CylinderTest {
        public static void main(String[] args) {
            int a =6;
            for (int i = 0; i < a; i++) {
                for (int j = 0; j < a; j++) {
                    if(i==j){
                        System.out.print(i+1+" ");
                    }
                    else{
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
        }
}
