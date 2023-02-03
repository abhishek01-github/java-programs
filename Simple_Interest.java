import java.util.Scanner;
public class Simple_Interest{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter principal amount, time, and rate of interest");
        System.out.println("Simple interest is: "+ (s.nextInt()*s.nextInt()*s.nextDouble())/100);
    }
}