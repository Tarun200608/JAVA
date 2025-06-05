public class problem46 {
        public static void main(String[] args) {
            int a []= {1,5,7,5,8,9,6,45,89};
            int b []= {1,5,7,5,8,9,6,45,89};
            Boolean comp = false;
            if(a.length==b.length){
                for (int i = 0; i < a.length; i++) {
                    if(a[i]==b[i]){
                        comp = true;
                    }
                    else{
                        comp=false;
                    }
                }
            }
            else{
                System.out.println("it is not same ");
            }
            if (comp) {
                System.out.println("yes it is true ");
            }
        }
}
