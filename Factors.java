import java.util.Scanner;
public class Factors {
    static int fact(int n){
        int count=2;
        for(short i=2;i<=n/2;i++){
            if(n%i==0)
                count++;
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number for its factors");
        int num = input.nextInt();
        System.out.println("The number of factors are: "+ fact(num));
    }
}