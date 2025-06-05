public class problem37 {
        public static void main(String[] args) {
            int a = 7565;
            int count =0;
            int b = (int)Math.log10(a)+1;
            System.out.println((int)Math.log10(a)+1);
            while(a!=0){
                a/=10;
                count++;
            }
            System.out.println(b);
            System.out.println(count);
        }
}
