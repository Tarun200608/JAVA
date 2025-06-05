public class annagram{
        public static void main(String[] args) {
            String  s= "hello";
            String d ="elolh";
            boolean yes = true;
            if(s.length()!=d.length()){
                yes = false;
            }
            else{
                int count[]=new int[256];
                for(int i=0;i<s.length();i++){
                    count[s.charAt(i)]++;
                    count[d.charAt(i)]--;
                }
                for(int j: count){
                    if(j!=0){
                        yes= false;
                    }
                }
            }
            if(yes){
                System.out.println("it is an annagram");
            }
            else{
                System.out.println("sorry it is not an annagram");
            }
        }
}