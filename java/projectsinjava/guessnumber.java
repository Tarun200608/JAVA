package projectsinjava;
import java.util.Scanner;

public class guessnumber {
        public static void main(String[] args) {
            int rand=(int)(Math.random()*100);
            Scanner sca=new Scanner(System.in);
            int count=0;
            System.out.println("enter a number:");
            while(true){
                int result=sca.nextInt();
                if(result>rand){
                    System.out.println("sorry it's to big");
                    count++;
                }
                else if(result<rand){
                    System.out.println("enter some greater number");
                    count++;
                }
                else if(result==rand){
                    System.out.println("yes!"+rand+"is the coorect guess"+" you take:"+count+"times");
                    break;
                }
            }
        }
}
