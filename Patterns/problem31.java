public class problem31 {
        public static void main(String[] args) {
            int a =153;
            int c = a;
            int sum =0;
            int count =0;
            while(a!=0){
                a=a/10;
                count++;
            }
            a=c;
            while(a!=0){
                int b = a%10;
                b = (int)Math.pow(b, count);
                sum =sum +b;
                a/=10;
            }
            if(c==sum){
                System.out.println("It is a palindrome");
            }
            else{
                System.out.println("it is not a palindrome");
            }
        }
}
