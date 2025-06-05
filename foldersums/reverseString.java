import java.util.ArrayList;

public class reverseString {
    public static void main(String[] args) {
    // String s="Helllo";
    // char c;
    // String rev ="";
    // for(int i=0;i<s.length();i++){
    // c=s.charAt(i);
    // rev = c+rev;

    // }
    // System.out.println(rev);;
    static int getCandidate(int n, int k) {
        // complete the function here
        ArrayList<Integer> num = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            num.add(i);
        }
        int size = num.size();
        while (size != 1) {
            for (int i = 0; i < size; i++) {
                if (i % k != 0) {
                    num.remove(i);
                }
            }
        }

    }
}
}
