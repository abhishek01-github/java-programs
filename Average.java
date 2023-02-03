import java.util.Scanner;
public class Average {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter numbers for average and press zero to calculate: ");
        int count=0,n,sum=0;
        while(true){
            n=in.nextInt();
            if(n==0)
                break;
            sum+=n;
            count++;
        }
        System.out.println("The average of these numbers is: "+(sum/count));
    }
}