import java.util.Arrays;

public class ReverseArrayRecursion {
    public static void main(String[] args) {
        int[] a = helper(new int[]{1,2,3,4,5,6},0);
        System.out.println(Arrays.toString(a));
    }
    static int[] helper(int[] a, int n){
        if(n==a.length){
            return a;
        }
        int num = a[n];
        a = helper(a, n+1);
        a[(a.length-1)-n] = num;
        return a;
    }
}