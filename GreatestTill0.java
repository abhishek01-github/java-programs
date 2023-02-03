import java.util.Scanner;
public class GreatestTill0 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int max=Integer.MIN_VALUE;
        while(true){
            int n = input.nextInt();
            if(n==0)
                break;
            if(n>max)
                max=n;
        }
        System.out.println(max);
    }
}