import java.util.ArrayList;
import java.util.Arrays;

public class reverseSentence {
    public static void main(String[] args) {
        // String Sentence="hiii heloo namstaa adham";
        // String Words[]=Sentence.split(" ");
        // String rev="";
        // for(int i=0;i<Words.length;i++){
        // String Word = Words[i];
        // String wordrev="";
        // char ch;
        // for(int j=0;j<Word.length();j++){
        // ch = Word.charAt(j);
        // wordrev= ch+wordrev;
        // }
        // rev = rev+wordrev+" ";
        // }
        // System.out.println(rev);
        int n = 9;
        int arr[] = new int[n];
        ArrayList<int[]> pairs = new ArrayList<>();
        int N = 0;
        for (int i = 2; i < n; i++) {
            Boolean flag = true;
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                // int result = i;
                arr[N] = i;
                N++;
            }
        }
        // for (int i = 0; i < arr.length; i++) {
        //     int p = arr[i];
        //     for (int j = i; j < arr.length; j++) {
        //         int q = arr[j];
        //         if (p * q <= n) {
        //             pairs.add(new int[] { p, q });
        //             if (p != q) {
        //                 pairs.add(new int[] { q, p });
        //             }
        //         } else {
        //             break;
        //         }
        //     }
        // }
        // // return pairs;
        // for (int[] is : pairs) {
        //     System.out.println(is);
        // }
        System.out.println(Arrays.toString(arr));

    }
}
