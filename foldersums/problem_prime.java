public class problem_prime {
        public static void main(String[] args) {
            int num  = 100;
            // if (num<=1) {
            //     System.out.println("It is a prime number")
            // }
            // else{
                for (int i = 2; i < 25/2; i++) {
                    Boolean flag = true;
                
                    for (int j = 2; j <=Math.sqrt(i); j++) {
                        
                        if (i%j==0) {
                            flag=false;
                            break;
                        }
                    }
                    if(flag){
                        System.out.println(i+" ");
                    }
                }
            // int num  = 2;
            // Boolean flag = true;
            // if (num<=1) {
            //     flag = false;
            // }
            // else{
            //     for (int i = 2; i <=Math.sqrt(num); i++) {
            //             if (num%i==0) {
            //                 flag=false;
            //                 break;
            //             }
            //         }
            //     }
            //     if(flag){
            //         System.out.println("it is prime number");
            //     }
            //     else{
            //         System.out.println("it is not prime number");
            //     }
            }
            
        }
