public class problem17 {
        public static void main(String[] args) {
            int a =9,b = 8;
            // int temp = a;
            // a= b ;
            // b =temp;
            // System.out.println("the swap of two numbers is :"+a+" "+b);
            a =a+b;
            b= a-b;
            a =a-b;
            System.out.println(a+" "+b);
        }
}
