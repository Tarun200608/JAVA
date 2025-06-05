import java.util.Arrays;

public class problem45 {
        public static void main(String[] args) {
            int a[]= {1,4,5,6,7,7,8,8,9,7,6};
            int b []={3,6,8,9,4,6,7,4,3,};
            if(Arrays.equals(a,b)){
                System.out.println("both are same ");
            }
            else {
                System.out.println("not same");
            }
        }
}
