public class palindrome2 {
        public static void main(String[] args) {
            String s="abbaa";
            int start = 0;
            int end = s.length()-1;
            boolean palindrome =true;
            while(start < end){
                if(s.charAt(start)!=s.charAt(end)){
                    System.out.println("it is not a palindrome");
                    palindrome=false;
                    break;
                }
                start++;
                end--;
            }
            if(palindrome){
                System.out.println("it is an palindrome ");
            }
            
        }

}
