public class problem27 {
        public static void main(String[] args) {
            String s = "mom";
            String rev = "";
            for(int i=0;i<s.length();i++){
                rev = s.charAt(i)+rev;
            }
            if(rev.equals(s)){
                System.out.println("Yay! it is a palindrome");
            }
            else{
                System.out.println("No it is not a palindrome");
            }
        }
}
