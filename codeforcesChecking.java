import java.util.*;
public class codeforcesChecking {
    static boolean checking(char c){
        String s = "codeforces";
        for(int i=0;i<10;i++){
            if(s.charAt(i)==c)
                return true;
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        for(int i=0;i<t;i++){
            char c = input.next().trim().charAt(0);
            if(checking(c)==true)
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
}