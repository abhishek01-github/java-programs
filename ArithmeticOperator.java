import java.util.Scanner;
class ArithmeticOperator {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter any two numbers");
        int a=scn.nextInt();
        int b=scn.nextInt();
            System.out.println("Enter the operation you want to perform");
            char c = scn.next().charAt(0);
            switch (c) {
                case '+':
                    System.out.println(a + b);
                    break;
                case '-':
                    System.out.println(a - b);
                    break;
                case '*':
                    System.out.println(a * b);
                    break;
                case '/':
                    System.out.println(a / b);
                default:
                    System.out.println("invalid operator");
            }
    }
}