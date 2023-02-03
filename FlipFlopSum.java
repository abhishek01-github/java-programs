import java.util.*;
public class FlipFlopSum {
    static int Sum(int n){
        Scanner input = new Scanner(System.in);
        int flag=0,x=-1,sum=0;
        int[] a = new int[n];
        for(int i=0;i<n;i++){
            a[i]=input.nextInt();
        }
        for(int i=0;i<n;i++){
            if(flag==0){
                if(a[i]==-1){
                    if(i<n-1){
                    if(a[i+1]==-1) {
                        sum = sum + 3;
                        flag = 1;
                        x=i;
                        continue;
                    }}
                        x=i;
                }
            }
            sum=sum+a[i];
        }
        if(x==-1){
            sum-=4;
        } else {
            return sum;
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        for(int i=0;i<t;i++){
            int n = input.nextInt();
            System.out.println(Sum(n));
        }
    }
}