import java.util.*;
public class B_The_String_Has_a_Target {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t=input.nextInt();
        while(t>0){
            int n=input.nextInt();
            String s=input.next().trim();
            int num=97;
            int ans=0;
            while((int)s.charAt(0)>=num){
                for(int i=n-1;i>=1;i--){
                    if((int)s.charAt(i)==num) {
                        ans = i;
                        break;
                    }
                }
                if(ans!=0)
                break;
                num++;
            }
            System.out.print(s.charAt(ans));
            for(int i=0;i<n;i++){
                if(i==ans)
                    continue;
                System.out.print(s.charAt(i));
            }
            System.out.println();
            t--;
        }
    }
}