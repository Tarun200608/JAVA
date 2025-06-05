public class problem38 {
        public static void main(String[] args) {
            int a = 7565;
            int sum =0;
            while(a!=0){
                int b =a%10;
                sum = sum +b;
                a/=10;
            }
            System.out.println(sum);
        }
}
