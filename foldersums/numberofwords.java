//{ Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])
    {
        repeatedSumOfDigits(1234);
    }
}

// } Driver Code Ends


//User function Template for Java
class Solution{
    static int repeatedSumOfDigits(int N){
        // code here
        int sd;
        while(true){
            sd = sum(N);
            if(sd<9){
                break;
            }
        }
        return sd;
        
    }
    static int sum(int n){
        int sum1=0;
        while(n!=0){
            sum1 += n%10;
            n /= 10;
        }
        return sum1;
    }
}
