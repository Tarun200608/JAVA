import java.util.*;

public class problem33 {
        public static void main(String[] args) {
            int [] a = {1,12,3,3,4,4,5,5,6,3,3,2,2,7,7};
            Set<Integer> set = new HashSet<Integer>();
            for (int i = 0; i < a.length; i++) {
                set.add(a[i]);
            }
            set.toArray();
            for (int integer : set) {
                System.out.println(integer);
            }    
        }
}
