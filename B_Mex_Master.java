import java.util.*;
public class B_Mex_Master {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t=input.nextInt();
        while(t>0){
            int n=input.nextInt();
            int zeroes=0;
            int ones=0;
            boolean flag=false;
            for(int i=0;i<n;i++){
                int a=input.nextInt();
                if(a==0)
                    zeroes++;
                if(a==1)
                    ones++;
                if(a>1)
                    flag=true;
            }
            if(zeroes-(n-zeroes)>1) {
                if(flag)
                    System.out.println(1);
                else if(zeroes==n)
                    System.out.println(1);
                else
                    System.out.println(2);
            }
            else
                System.out.println(0);
            t--;
        }
    }
}