public class problem25 {
        public static void main(String[] args) {
            int num = 100,t=0,a=1,b=1;
            System.out.print(a+" "+b+" ");
            while(t<=num){
                t=a+b;
                if(t>num){
                    break;
                }
                System.out.print(t+" ");
                a=b;
                b = t;
            }
        }
}
