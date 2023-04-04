import java.util.*;
public class A_Boy_or_Girl {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String s=input.next().trim();
        HashMap<Character,Boolean> mp = new HashMap<>();
        for(int i=0;i<s.length();i++){
            if(mp.get(s.charAt(i))==null)
                mp.put(s.charAt(i),true);
        }
        if(mp.size()%2==0)
            System.out.println("CHAT WITH HER!");
        else
            System.out.println("IGNORE HIM!");
    }
}