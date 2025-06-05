public class problem21 {
        public static void main(String[] args) {
            String s ="Hi hello i am in 1st class of 1075758$ fees " ;
            int lettercount =0;
            int numbercount =0;
            int spaceccount =0;
            int othercount =0;
            char [] c = s.toCharArray();
            for(Character ta : c){
                if(Character.isLetter(ta)){
                    lettercount++;
                }
                else if(Character.isDigit(ta)){
                    numbercount++;
                }
                else if(Character.isSpaceChar(ta)){
                    spaceccount++;
                }
                else{
                    othercount++;
                }
            }
            System.out.println(lettercount+" "+numbercount+" "+spaceccount+" "+othercount);
        }
}
