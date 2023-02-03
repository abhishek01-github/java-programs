 import java.util.Scanner;
public class Palindrome {
    static boolean isPalin(String str , int n){
        for(int i=0,j=n-1;i<n/2;i++,j--)
        {
            if(str.charAt(i)!=str.charAt(j))
                return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a String");
        String str= input.next();
        int n= str.length();
        if(isPalin(str,n))
            System.out.println("The string is a Palindrome");
        else
            System.out.println("The string is not a Palindrome");
        input.close();
    }
}