import java.util.*;
public class prependAndAppend {
    static int finalString(int n,String s){
        int ans = n;
        for(int i=0,j=n-1;i<n/2;i++,j--){
            if(s.charAt(i)!=s.charAt(j))
                ans-=2;
            else
                return ans;
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        for(int i=0;i<t;i++){
            int n = input.nextInt();
            String s = input.next().trim();
            System.out.println(finalString(n,s));
        }
    }
}