import java.util.Scanner;
public class GreaterNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter any two numbers");
        System.out.println(Math.max(input.nextInt(),input.nextInt())+ " is greater");
    }
}