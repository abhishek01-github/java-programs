import java.util.*;
public class TwoTowers {
    static boolean towers(int n, int m, String s1, String s2){
        int flag1=0,flag2=0;
        int count1=0,count2=0;
        for(int i=1;i<n;i++){
            if(s1.charAt(i)==s1.charAt(i-1)) {
                flag1=1;
                count1++;
            }
        }
        for(int i=1;i<m;i++){
            if(s2.charAt(i)==s2.charAt(i-1)) {
                flag2=1;
                count2++;
            }
        }
        if(count1>1 || count2>1)
            return false;
        if(flag1==0 && flag2==0)
            return true;
        if(flag1==1 && flag2==1)
            return false;
        if(s1.charAt(n-1)==s2.charAt(m-1))
            return false;
        return true;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        for(int i=0;i<t;i++){
            int n = input.nextInt();
            int m = input.nextInt();
            String s1 = input.next().trim();
            String s2 = input.next().trim();
            if(towers(n,m,s1,s2))
                System.out.println("yes");
            else
                System.out.println("no");
        }
    }
}