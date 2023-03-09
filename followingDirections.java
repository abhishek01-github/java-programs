import java.util.*;
public class followingDirections {
    static boolean candy(int n,String s){
        int x=0;
        int y=0;
        for(int i=0;i<n;i++){
            if(s.charAt(i)=='U')
                y++;
            if(s.charAt(i)=='D')
                y--;
            if(s.charAt(i)=='L')
                x--;
            if(s.charAt(i)=='R')
                x++;
            if(x==1 && y==1)
                return true;
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        for(int i=0;i<t;i++){
            int n = input.nextInt();
            String s = input.next().trim();
            if(candy(n,s)==true)
                System.out.println("yes");
            else
                System.out.println("no");
        }
    }
}