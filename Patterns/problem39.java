public class problem39 {
        public static void main(String[] args) {
            int a =64373;
            int evencount = 0 , oddcount = 0 ;
            while(a!=0){
                int b =a%10;
                if (b%2==0) {
                    evencount++;
                } else {
                    oddcount++;
                }
                a/=10;
            }
            System.out.println(evencount+" "+oddcount);
        }
}
