import java.util.Scanner;
public class Factorial {
    static int fact(int n){
        if(n==1)
            return 1;
        else
            return n*fact(n-1);
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number");
        int num= input.nextInt();
        System.out.println("The factorial of "+ num +" is: " + fact(num));
    }
}