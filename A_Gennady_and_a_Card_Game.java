import java.util.*;
public class A_Gennady_and_a_Card_Game {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String s=input.next().trim();
        boolean flag=false;
        for(int i=0;i<5;i++){
            String h=input.next().trim();
            if(s.charAt(0)==h.charAt(0) || s.charAt(1)==h.charAt(1))
                flag=true;
        }
        if(flag)
            System.out.println("yes");
        else
            System.out.println("no");
    }
}