import java.util.Arrays;

public class duplicateinarray {
        public static void main(String[] args) {
            int arr[]={1,1,2,3,3,3,4,5,10};
            int j=0;
            for(int i=1;i<arr.length;i++){
                if(arr[i]!=arr[j]){
                    j++;
                    arr[j]=arr[i];
                }
            }
            for(int i=0;i<=j;i++){
                System.out.print(arr[i]+" ");
            }
            // System.out.println(Arrays.toString(arr));
        }
}
