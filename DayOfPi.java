import java.util.*;
public class DayOfPi {
    static int compare(String n, String num){
        int count=0;
        for(int i=0;i<n.length();i++){
            if(n.charAt(i)!=num.charAt(i))
                return count;
            if(n.charAt(i)==num.charAt(i))
                count++;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();
        String num = "314159265358979323846264338327";
        for(int i=0;i<t;i++)
        {
            String n = scn.next();
            int c = compare(n,num);
            System.out.println(c);
        }
    }
}