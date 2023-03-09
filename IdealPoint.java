import java.util.*;
public class IdealPoint {
    static boolean ideal(int n,int k){
        Scanner input = new Scanner(System.in);
        int flag=0,found=0;
        int n1=0,n2=0;
        for(int i=0;i<n;i++){
            int l = input.nextInt();
            int r = input.nextInt();
            if(k>=l && k<=r)
                flag++;
            if(l==k && r==k)
                found=1;
            if(l==k)
                n1++;
            if(r==k)
                n2++;
        }
        if(flag==0)
            return false;
        if(found==1)
            return true;
        if(flag==1 && found==0)
            return false;
        if(n1>0 && n2>0)
            return true;
        return false;

    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        for(int i=0;i<t;i++){
            int n = input.nextInt();
            int k = input.nextInt();
            if(ideal(n,k))
                System.out.println("yes");
            else
                System.out.println("no");
        }
    }
}