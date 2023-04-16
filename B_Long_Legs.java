import java.util.*;
public class B_Long_Legs {
    static boolean prime(long no)
    {
        int count = 0;
        for (int i = 1; i <= no; i++)
        {
            if (no % i == 0)
                count++;
        }
        if (count == 2)
            return true;
        else
            return false;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t=input.nextInt();
        while(t>0){
            long ans=0;
            long a=input.nextLong();
            long b=input.nextLong();
            if(prime(a))
                ans+=a;
            if(prime(b))
                ans+=b;
            if(ans==0){
                if(a%b==0 || b%a==0){
                    long count=Integer.MAX_VALUE;
                    for(int leg=1;leg<Math.min(a,b);leg++){
                        if((a/leg)+(b/leg)<count)
                            count=(a/leg)+(b/leg);
                        leg++;
                    }
                } else {
                    
                }
            }
            t--;
        }
    }
}