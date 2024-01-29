import java.util.Scanner;
public class Armstrong {
    static boolean isArm(int num)
    {
        int sum=0,n=0;
        for(int i=num;i!=0;i/=10)
            n++;
        for(int i=num;i!=0;i/=10)
            sum+=Math.pow(i%10,n);
        if(sum==num)
            return true;
        else
            return false;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number");
        if(isArm(input.nextInt()))
        System.out.println("It is an armstrong number");
        else
        System.out.println("It is not an armstrong number");
        input.close();

    }
}