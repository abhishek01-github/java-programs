import java.util.*;
public class SkipWordRecursion {
    public static void main(String[] args) {
        skipWord("abcatap","");
    }
    static void skipletter(String up, String p){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        if(ch == 'a')
            skipWord(up.substring(1),p);
        else
            skipWord(up.substring(1),p+ch);
    }
    static void skipWord(String up, String p){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        if(up.startsWith("cat") && !(up.startsWith("cata")))
            skipWord(up.substring(3),p);
        else
            skipWord(up.substring(1),p+ch);
    }

}