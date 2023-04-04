import java.util.*;
public class B_Grab_the_Candies {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        while(t>0){
            int n = input.nextInt();
            int even=0,odd=0;
            for(int i=0;i<n;i++){
                int a = input.nextInt();
                if(a%2==0)
                    even+=a;
                else
                    odd+=a;
            }
            if(even>odd)
                System.out.println("yes");
            else
                System.out.println("no");
            t--;
        }
    }
}