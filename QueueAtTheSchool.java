import java.util.*;
public class QueueAtTheSchool {
    static String finalQueue(String s,int n, int t){
        char[] S = s.toCharArray();
        for(int j=0;j<t;j++){
            for(int i=1;i<n;i++) {
                if (S[i] == 'G' && S[i - 1] == 'B') {
                    S[i] = 'B';
                    S[i - 1] = 'G';
                }
            }
        }
        for(int i=0;i<S.length;i++){
            System.out.println(S[i]);
        }
        return S.toString();
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int t = input.nextInt();
        String s = input.next().trim();
        System.out.println(finalQueue(s,n,t));
    }
}