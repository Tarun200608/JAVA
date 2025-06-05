public class problem26 {
        public static void main(String[] args) {
            String s = "Tarun";
            String rev = "";
            for(int i=0;i<s.length();i++){
                rev = s.charAt(i)+rev;
            }
            System.out.println(rev);
        }
}
