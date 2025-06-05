public class pattern17 {
    public static void main(String[] args) {
        int n=20;
        for(int i=0;i<n;i++){
            for(int s=0;s<n-i-1;s++){
                System.out.print(" ");
            }
            char a ='A';
            int brea =(2*i+1)/2;
            for(int j=1;j<=2*i+1;j++){
                    System.out.print(a);
                    if(j<= brea)
                        a++;
                    else a--;
                }
            System.out.println();
        }
    }
}
