package projectsinjava;
import java.util.Scanner;

public class passwor {
        public static void main(String[] args) {
            String pass ="Tarun@143";
            Scanner sca=new Scanner(System.in);
            int count =0;
            System.out.println("Pls enter your Password");
            while(true){
                String result=sca.nextLine();
                if(result.equals(pass)){
                    System.out.println("hurray! Your Password Is Correct");
                    break;
                }

                else {
                    System.out.println("sorry! it's a wrong password😔");
                    count++;
                }
                if(count ==3){
                    System.out.println("Sorry your Attemps has been done");
                    break;
                }

            }
        }
    }