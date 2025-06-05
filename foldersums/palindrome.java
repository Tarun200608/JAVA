public class palindrome {
        public static void main(String[] args) {
            String s ="Tarun";
            char[] c=s.toCharArray();
            // for (int i = 0; i < s.length()/2; i++) {
                
            //     char temp= c[i];
            //     c[i]= c[s.length()-i-1];
            //     c[s.length()-i-1]= temp;
            // }
            // System.out.println(c);
            String rev ="";
            for (int i = 0; i < s.length(); i++) {
                rev =  c[i]+rev;
            }
            System.out.println(rev);
        }
}
