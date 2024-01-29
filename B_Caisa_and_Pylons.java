import java.io.*;
import java.util.*;
public class B_Caisa_and_Pylons {

    static IOHandler sc = new IOHandler();

    public static void main(String[] args) {

        solve(1);

    }

    private static void solve(int t) {
        int n = sc.nextInt();
        int[] a = sc.readArray(n);
        long dollars = a[0];
        long score = 0;

        for (int i = 1; i < n; i++) {
            score += (a[i-1] - a[i]);
            if (score < 0) {
                dollars += Math.abs(score);
                a[i-1] = a[i];
                score = 0;
            }
        }
        System.out.println(dollars);
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