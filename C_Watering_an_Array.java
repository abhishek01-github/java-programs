import java.io.*;
import java.util.*;
public class C_Watering_an_Array {

    static IOHandler sc = new IOHandler();

    public static void main(String[] args) {

        int t = sc.nextInt();

        for (int i = 1; i <= t; ++i) {
            solve(i);
        }
    }

    private static void solve(int t) {
        int n = sc.nextInt();
        int k = sc.nextInt();
        int d = sc.nextInt();
        int[] a = sc.readArray(n);
        int[] v = sc.readArray(k);
        int ans = 0;

        for (int i = 0; i < d && i <= 2 * n; i++) {
            int cur = 0;
            for (int j = 0; j < n; j++) {
                cur += (a[j] == j + 1) ? 1 : 0;
            }
            cur += (d - i - 1) / 2;
            if (cur > ans) {
                ans = cur;
            }
            for (int j = 0; j < v[i % k]; j++) {
                a[j]++;
            }
        }
        System.out.println(ans);
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
