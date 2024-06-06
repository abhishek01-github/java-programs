public class SumTillNRecursion {
    public static void main(String[] args) {
        int sum = helper(10);
        System.out.println(sum);
    }
    static int helper(int n){
        if(n==0)
          return 0;
        return n + helper(n-1);
    }
}
