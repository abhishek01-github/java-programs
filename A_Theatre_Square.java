import java.io.*;
import java.util.*;
public class A_Theatre_Square {

    static IOHandler sc = new IOHandler();

    public static void main(String[] args) {

        solve(1);

    }

    private static void solve(int t) {
        long n = sc.nextLong();
        long m = sc.nextLong();
        long a = sc.nextLong();

        if(a>=m)
            m = 1;
        else
            m = (m%a==0) ? m/a : m/a+1;
        if(a>=n)
            n = 1;
        else
            n = (n%a==0) ? n/a : n/a+1;
        System.out.println(m*n);

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