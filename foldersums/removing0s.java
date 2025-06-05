public class removing0s {
        public static void main(String[] args) {
            // String d ="11233000460046400";
            // StringBuilder sb = new StringBuilder();
            // StringBuilder sb1 = new StringBuilder();
            // for(char c : d.toCharArray()){
            //     if(Character.isDigit(c) && c!='0'){
            //         sb.append(c);
            //     }
            //     else{
            //         sb1.append(c);
            //     }
            // }
            // System.out.println(sb1+""+sb);
            
                static int isStrong(int N) {
                    // code here
                    int c = fact(N);
                    if(c==N){
                        return 1;
                    }
                    else{
                        return 0;
                    }
                }
                static int fact(int n){
                    int sum=0,fact=1;
                    while(n!=0){
                        int a = n%10;
                        for(int i=1;i<=a;i++){
                            fact *=i;
                        }
                        sum +=fact;
                        n /=10;
                    }
                    return sum;
            }
        }
}
