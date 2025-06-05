public class seperating_the_letters {
        public static void main(String[] args) {
            String s ="aaABBBaBCDdcdDDGgf123gsv23kgAsDfgsdDS";
            StringBuilder sb = new StringBuilder();
            StringBuilder sb1 = new StringBuilder();
            StringBuilder sb2 = new StringBuilder();
            for ( char ch : s.toCharArray()) {
                if(Character.isUpperCase(ch)){
                    sb.append(ch);
                }
                else if(Character.isDigit(ch)){
                    sb1.append(ch);
                }
                else{
                    sb2.append(ch);
                }
            }
            System.out.println(sb);
            System.out.println(sb1);
            System.out.println(sb2);
        }
}
