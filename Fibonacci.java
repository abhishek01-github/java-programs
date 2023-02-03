import java.util.Scanner;
public class Fibonacci {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter any number");
        int n = input.nextInt();
        int a=0,b=1;
        System.out.println("Fibonacci series upto "+n+ " is:");
        if(n==1)
            System.out.println(a);
        if(n>=2)
            System.out.print(a + " " +b);
        if(n>2)
        {
            for(int i=3;i<=n;i++) {
                System.out.print(" " + (a+b));
                b = a + b;
                a = b - a;
            }
        }

    }
}