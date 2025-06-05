public class problem28 {
        public static void main(String[] args) {
            int a = 1221;
            int c =a;
            int num=0;
            while(a!=0){
                int b = a %10;
                num=(num*10)+b;
                a/=10;
            }
            if(num == c){
                System.out.println("It is a palindrome number");
            }
            else{
                System.out.println("It is not a pallindrome number");
            }
        }
}
