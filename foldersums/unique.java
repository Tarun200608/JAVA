public class unique {
        public static void main(String[] args) {
            String s="Hello Hi Tarun";
            boolean a[] = new boolean[127];
            for(int i=0;i<s.length();i++){
                char c =s.charAt(i);
                if(!a[c]){
                    a[c]=true;
                    System.out.print(c+" ");
                }
            }
        }
}
