import java.util.*;
public class ServalAndMochasArray {
    static int findGCD(int a, int b)
    {
        if (a == 0)
            return b;
        return findGCD(b % a, a);
    }
    static boolean checkGood(int n, int[] a){
        int x=100000;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++)
                x=Math.min(x,findGCD(a[i], a[j]));
        }
        if(x>2)
            return false;
        else
            return true;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        for(int i=0;i<t;i++){
            int n = input.nextInt();
            int[] a = new int[n];
            for(int j=0;j<n;j++)
                a[j]=input.nextInt();
            if(checkGood(n,a))
                System.out.println("yes");
            else
                System.out.println("no");
        }
    }
}