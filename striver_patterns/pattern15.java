public class pattern15 {
    public static void main(String[] args) {
        int n=5;
        for(int i=n-1;i>=0;i--){
            char a ='A';
            for(int j=0;j<=i;j++){
                        System.out.print(a);
                        a++;
                }
                System.out.println();
        }
    }
}
