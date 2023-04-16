import java.util.*;
public class A_Coins {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
         int t=input.nextInt();
         while(t>0){
             long n=input.nextLong();
             long k=input.nextLong();
             if(((n-k)%2==0 || n%k==0) || n%2==0)
                 System.out.println("yes");
             else
                 System.out.println("no");
             t--;
         }
    }
}