import java.util.*;
public class problem36 {
        public static void main(String[] args) {
            int a [] = {1,2,3,3,4,4,4,5,5,7,6,5,4};
            Set<Integer>ta =new HashSet<Integer>();
            for (int i = 0; i < a.length; i++) {
                if (ta.add(a[i])==false) {
                    System.out.println("the dupilcate array is :"+a[i]);
                }
            }

        }
}
