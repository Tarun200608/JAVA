public class counttheword {
        public static void main(String[] args) {
            String s = "aaabbbbbcdd";
            int count=1;
            StringBuilder sb = new StringBuilder();
            for(int i=0;i<s.length();i++){
                if(i+1 <s.length() && s.charAt(i)==s.charAt(i+1)){
                    count++;
                }
                else{
                    sb.append(s.charAt(i)).append(count);
                    count=1;
                }
            }
            String new1 = sb.toString();
            System.out.println(new1);
        }
}
