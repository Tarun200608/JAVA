public class problem42 {
        public static void main(String[] args) {
            int a [ ] = {1,3,4,5,5,6,66,54,4};
            for (int i : a) {
                if (i%2==0) {
                    System.out.print(i+" ");
                }
            }
            System.out.println();
            for (int j : a) {
                if (j%2!=0) {
                    System.out.print(j+" ");
                }
            }
        }
}
