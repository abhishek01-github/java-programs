import java.util.*;
public class Subsets {
    public static void main(String[] args) {
        System.out.println(subsequence("abc",""));
    }
    static List<String> subsequence(String up, String p){
        if(up.isEmpty()){
            List<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch = up.charAt(0);
        List<String> left = subsequence(up.substring(1),p);
        List<String> right = subsequence(up.substring(1),p+ch);
        left.addAll(right);

        return left;

    }
}