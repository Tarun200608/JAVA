public class problem18 {
        public static void main(String[] args) {
            int a = 1234;
            int sum =0;
            while(a!=0){
                int b = a%10;
                sum += b;
                a=a/10;
            }
            System.out.println(sum);
        }
}
