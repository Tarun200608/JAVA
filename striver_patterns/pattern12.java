public class pattern12 {
    public static void main(String[] args) {
        int n=5;
        int space = 2*(n-1);
        for(int i=0;i<n;i++){
                for(int j=0;j<=i;j++){
                        System.out.print(j+1);
                }
                for(int k=1;k<=space;k++){
                    System.out.print(" ");
                }
                for(int s=i+1;s>0;s--){
                    System.out.print(s);
                }
                System.out.println();
                space -=2;
        }
    }
}
