package projectsinjava;
import java.util.Scanner;

public class rockpaperscisccors {
    public static void main(String[] args) {
       String arr[]={"rock","paper","Scissors"};
       int random=(int)(Math.random()*3);
       String compresult=arr[random];
       Scanner user =new Scanner(System.in);
       System.out.print("Enter rock paper Scissors:");
       String input =user.nextLine();
       String result;
       int score=0;
       System.out.println("Computer choice:"+compresult);
       switch (input) {
        case "rock":
            if(compresult.equals(input)){
                System.out.println("draw match");
            }
            else{
                result=compresult.equals("Scissors")?"you win":"you are defeted";
                System.out.println(result);
            }
            break;
        case "paper":
            if(compresult.equals(input)){
                System.out.println("draw match");
            }
            else{
                result=compresult.equals("rock")?"you win":"you are defeted";
                System.out.println(result);
            }
            break;
        case "Scissors":
            if(compresult.equals(input)){
                System.out.println("draw match");
            }
            else{
                result=compresult.equals("paper")?"you win":"you are defeted";
                System.out.println(result);
            }
            break;
       
        default:
            System.out.println("enter a correct input");
            break;
       }
    }
}