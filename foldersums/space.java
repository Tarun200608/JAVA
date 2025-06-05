public class space {
        public static void main(String[] args) {
            String s="HEllo fjdfwaf dfjasefd fvdsdvbsdv svjecv dcakcaf cacnos";
            StringBuilder st = new StringBuilder();
            for(int i=0;i<s.length();i++){
                if(s.charAt(i)!=' ' ){
                    st.append(s.charAt(i));
                }
            }
            String ws = st.toString();
            System.out.println(ws);
        }
}
