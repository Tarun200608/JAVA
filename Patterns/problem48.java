public class problem48 {
        public static void main(String[] args) {
            int arr[] ={1,5,6,7,6,87,90};
            int max =0;
            int min =arr[0];
            for (int i : arr) {
                if(max<i){
                    max = i;
                }
               else if(min>i){
                    min = i;
                }

            }
            System.out.println(max+" "+min);
        }
}
