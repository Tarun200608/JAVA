public class duplicatechar {
        public static void main(String[] args) {
            String s="G Tarun Seshank Deena#$^%&";
            int charcount[]=new int[256];
            for(char ch : s.toCharArray()){
                charcount[ch]++;
            }
            for(int i=0;i<=256;i++){
                if(charcount[i]>=1){
                    System.out.println((char)i+":"+charcount[i]);
                }
            }
        }
}
