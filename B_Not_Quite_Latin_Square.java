import java.io.*;
import java.util.*;
public class B_Not_Quite_Latin_Square {

    static IOHandler sc = new IOHandler();

    public static void main(String[] args) {

        int t = sc.nextInt();

        for (int i = 1; i <= t; ++i) {
            solve(i);
        }
    }

    private static void solve(int t) {
        String a = sc.next().trim();
        String b = sc.next().trim();
        String c = sc.next().trim();

        for (int i = 0; i < 3; i++) {
           if(a.charAt(i)=='?') {
               check(a);
               return;
           }
        }
        for (int i = 0; i < 3; i++) {
            if(b.charAt(i)=='?') {
                check(b);
                return;
            }
        }
        for (int i = 0; i < 3; i++) {
            if(c.charAt(i)=='?') {
                check(c);
                return;
            }
        }
    }

    static void check(String s){
        int a = 0;
        int b = 0;
        int c = 0;
        for (int i = 0; i < 3; i++) {
            if(s.charAt(i)=='A')
                a++;
            else if(s.charAt(i)=='B')
                b++;
            else if(s.charAt(i)=='C')
                c++;
        }
        if(a==0)
            System.out.println("A");
        else if(b==0)
            System.out.println("B");
        else
            System.out.println("C");
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