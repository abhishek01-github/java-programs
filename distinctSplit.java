import java.util.*;
public class distinctSplit {
    static int split(int n,String s){
        int count1 = 1;
        int count2 = 1;
        int max = 0;
        for(int x=1,y=n-1;x<n-1;x++,y--){
        for(int i=1;i<x;i++) {
            int flag = 0;
            for (int j = 0; j < i; j++) {
                if (s.charAt(i) == s.charAt(j)) {
                    flag = 1;
                    break;
                }
            }
            if (flag == 0)
                count1++;
        }
            for(int i=1;i<y;i++) {
                int flag = 0;
                for (int j = 0; j < i; j++) {
                    if (s.charAt(i) == s.charAt(j)) {
                        flag = 1;
                        break;
                    }
                }
                if (flag == 0)
                    count2++;
            }
            if(count1+count2>max)
                max=count1+count2;
        }
        return max;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        for(int i=0;i<t;i++){
            int n = input.nextInt();
            String s = input.next().trim();
            System.out.println(split(n,s));
        }
    }
}