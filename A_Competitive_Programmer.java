import java.io.*;
import java.util.*;

public class A_Competitive_Programmer {

    static IOHandler sc = new IOHandler();

    public static void main(String[] args) {

        solve(1);
    }

    private static void solve(int t) {
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            char[] y = sc.next().trim().toCharArray();
            int zeroes = 0;
            int even = 0;
            int sum = 0;
            for (int j = 0; j < y.length; j++) {
                int x = y[j] - '0';
                if (x == 0)
                    zeroes++;
                if (x % 2 == 0)
                    even++;
                sum += x;
            }
            if ((sum % 3 == 0 && zeroes > 0) && even > 1) {
                System.out.println("red");
            } else {
                System.out.println("cyan");
            }
        }
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

        int[] readArray(int n) {
            int[] res = new int[n];

            for (int i = 0; i < n; ++i)
                res[i] = nextInt();

            return res;
        }

        int[] readArray2(int n) {
            int[] res = new int[n + 1];

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

        String nextLine() {
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
