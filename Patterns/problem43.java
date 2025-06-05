public class problem43 {
        public static void main(String[] args) {
            int a = 1534;
            int b,c=0;
            while(a!=0){
                b= a%10;
                c = (c*10)+b;
                a/=10;
            }
            System.out.println(c);
        }
}
