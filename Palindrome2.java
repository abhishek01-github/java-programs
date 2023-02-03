import java.util.Scanner;
public class Palindrome2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter any String");
        String str1 = input.next();
        String str2 = new StringBuffer(str1).reverse().toString();
        if(str1.equals(str2))
            System.out.println("String is a palindrome");
        else
            System.out.println("String is not a palindrome");
    }
}