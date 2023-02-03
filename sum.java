import java.util.Scanner;

public class sum {
    public static void main(String[] args) {
        int a,b;
        Scanner scn = new Scanner(System.in);
        System.out.println("enter value of a and b");
        a=scn.nextInt();
        b=scn.nextInt();
        int sum = a+b;
        System.out.println("Sum of the numbers "+a+" and "+b+" is: "+sum);
        scn.close();
    }
}
