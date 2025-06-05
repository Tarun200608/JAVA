import java.util.HashSet;

public class buplicatewords {
        public static void main(String[] args) {
            String sentense = "The Tarun is The Good Good Boy And He is Good Good Student";
            String Words[]=sentense.split(" ");
            HashSet<String> hash = new HashSet<>();
            for(String ha : Words){
                hash.add(ha);
            }
            for(String s : hash){
                int count=0;
                for(int i=0;i<Words.length;i++){
                    if(s.equals(Words[i])){
                        count++;
                    }
                }
                System.out.println(s +": "+count);
            }
        }
}
