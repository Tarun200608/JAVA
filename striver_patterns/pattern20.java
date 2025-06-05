public class pattern20 {
    public static void main(String[] args) {
        int a=5;
        int space =2*(a-1);
        for (int i = a-1; i >=0; i--) {
            for (int j = 0; j < a-i; j++) {
                System.out.print("*");
            }
            for(int k=1;k<=space;k++){
                System.out.print(" ");
            }
            for (int j = a-i; j >0; j--) {
                System.out.print("*");
            }
            space -= 2;
            System.out.println();
        }
        for (int i = 1; i < a; i++) {
            for (int j = 0; j < a-i; j++) {
                System.out.print("*");
            }
            for (int j = 0; j < 2*i; j++) {
                System.out.print(" ");
            }
            for (int j = a-i; j >0; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
