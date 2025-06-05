public class problem40 {
        public static void main(String[] args) {
            int a =10,b=45,c=3;
            int d = c > (a>b ? a:b) ? c:(a>b ? a:b);
            if(a>b && a>c){
                System.out.println(a);
            }
            else if(b>c){
                System.out.println(b);
            }
            else{
                System.out.println(c);
            }
            System.out.println(d);
        }

}
