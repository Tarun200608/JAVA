public class pattern18 {
    public static void main(String[] args) {
        int n=5;
        for(int i=0;i<n;i++){
            char a ='E';
            a--;
            for(int j=0;j<=i;j++){
                System.out.print(a);
                a--;
            }
            System.out.println();
        }
    }
}
