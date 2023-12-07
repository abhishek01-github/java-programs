import java.io.*;
import java.util.*;
public class Reach_Codetown {

    static IOHandler sc = new IOHandler();

    public static void main(String[] args) {

        int t = sc.nextInt();

        for (int i = 1; i <= t; ++i) {
            solve(i);
        }
    }

    private static void solve(int t) {
        String s = sc.next().trim();

        for (int i = 0; i < 8; i++) {
            if((i==1 || i==3) || i==5){
                if(!isvowel(s.charAt(i))) {
                    System.out.println("NO");
                    return;
                }
            }
            if((i==0 || i==2) || i==4 || (i==6 || i==7)){
                if(isvowel(s.charAt(i))) {
                    System.out.println("NO");
                    return;
                }
            }
        }
        System.out.println("YES");
    }
    private static boolean isvowel(char s){
        return s=='A' || s=='E' || s=='I' || s=='O' || s=='U';
    }

    private static class IOHandler {
        BufferedReader br;
        StringTokenizer st;

        public IOHandler() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }

        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        int [] readArray(int n) {
            int [] res = new int [n];

            for (int i = 0; i < n; ++i)
                res[i] = nextInt();

            return res;
        }

        int [] readArray2(int n) {
            int [] res = new int [n + 1];

            for (int i = 1; i <= n; ++i)
                res[i] = nextInt();

            return res;
        }

        long nextLong() {
            return Long.parseLong(next());
        }

        double nextDouble() {
            return Double.parseDouble(next());
        }

        String nextLine(){
            String str = "";
            try {
                str = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }

    }

}
