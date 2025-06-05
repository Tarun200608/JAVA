import java.util.Scanner;
class newException extends Exception{
    public String toString(){
        return super.toString()+"I am a toString() message";
    }
    public String getMessage(){
        return super.getMessage()+"I am a get message";
    }
}
public class exe {
        public static void main(String[] args) {
            int a ;
            Scanner sc = new Scanner(System.in);
            a= sc.nextInt();
            if(a<9){
                try{
                    throw new newException();
                    // throw new ArithmeticException("This is an execiption");
                }
                catch(Exception e){
                    System.out.println(e.getMessage());
                    System.out.println(e.toString());
                }
            }
        }
}
