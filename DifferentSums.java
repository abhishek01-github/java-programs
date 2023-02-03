import java.util.Scanner;
public class DifferentSums {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the numbers for sums of negative, positive odd and even numbers and 0 to stop");
        int sumN=0,sumO=0,sumE=0;
        while(true){
            int n=in.nextInt();
            if(n==0)
                break;
            else if(n<0)
                sumN+=n;
            else if(n%2==0)
                sumE+=n;
            else
                sumO+=n;
        }
        System.out.println("The sum of all negative numbers: "+sumN);
        System.out.println("The sum of all positive odd numbers: "+sumO);
        System.out.println("The sum of all positive even numbers: "+sumE);
    }
}