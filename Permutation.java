import java.util.*;
public class Permutation{
    public static void main(String[] args) {
        System.out.println(permutations("", "abc"));
    }
    static ArrayList<String> permutations(String p, String up){
        if(up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch = up.charAt(0);

        ArrayList<String> ans = new ArrayList<>();
        for(int i=0; i<=p.length(); i++){
            String first = p.substring(0,i);
            String last = p.substring(i,p.length());
            ans.addAll(permutations(first + ch + last, up.substring(1)));
        }
        return ans;
    }
}