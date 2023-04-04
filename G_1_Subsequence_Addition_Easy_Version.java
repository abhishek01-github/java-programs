import java.util.*;
public class G_1_Subsequence_Addition_Easy_Version {
    static boolean subArraySum(int arr[], int n, int sum) {
        int currentSum = arr[0], start = 0, i;
        for (i = 1; i <= n; i++) {
            while (currentSum > sum && start < i - 1) {
                currentSum = currentSum - arr[start];
                start++;
            }
            if (currentSum == sum) {
                int p = i - 1;
                return true;
            }
            if (i < n)
                currentSum = currentSum + arr[i];
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        while (t>0){
            int n = input.nextInt();
            int[] a = new int[n];
            for(int i=0;i<n;i++){
                a[i]=input.nextInt();
            }
            Arrays.sort(a);
            if(a[0]!=1) {
                System.out.println("no");
                continue;
            }
            boolean flag = true;
            for(int i=1;i<n;i++){
                if(a[i]==a[i-1])
                    continue;
                if (subArraySum(a,i,a[i]))
                    continue;
                else{
                    flag=false;
                    break;
                }
            }
            if(flag)
                System.out.println("YES");
            else
                System.out.println("NO");
            t--;
        }
    }
}