import java.util.*;
public class D_Odd_Queries {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int x=0;x<t;x++){
            int n = in.nextInt();
            int q = in.nextInt();
            int[] a = new int[n];
            for(int i=0;i<n;i++){
                a[i]=in.nextInt();
                if(i!=0)
                    a[i]+=a[i-1];
            }
            while(q>0){
                int sum=a[a.length-1];
                int l = in.nextInt();
                int r = in.nextInt();
                int k = in.nextInt();
                if(l==1) {
                    if (a[r - 1] > k * r)
                        sum -= a[r - 1] - k * r;
                    else
                        sum+=k*r-a[r-1];
                }else {
                    if (a[r - 1] - a[l - 2] > k * (r - l + 1))
                        sum-= a[r - 1] - a[l - 2] - k * (r - l + 1);
                    else
                        sum += k * (r - l + 1) - a[r - 1] - a[l - 2];
                }
                if(sum%2!=0)
                    System.out.println("yes");
                else
                    System.out.println("no");
                q--;
            }
        }
    }
}