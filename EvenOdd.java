import java.util.*;
public class EvenOdd{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter any number");
        if(input.nextInt()%2==0)
            System.out.println("Even");
        else
            System.out.println("odd");
            input.close();
    }
}