import java.io.*;
import java.util.*;
public class C_Array_Game {

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

        long [] arr = new long [n];
        for (int i = 0; i < n; ++i) {
            arr[i] = sc.nextLong();
        }

        if (k >= 3) {
            System.out.println(0);
            return;
        }
        long result = Long.MAX_VALUE;

        TreeSet<Long> set = new TreeSet<>();

        long diff;

        for (long num : arr) {
            result = Math.min(num, result);
            set.add(num);
        }

        Long key;

        for (int i = 0; i < n; ++i) {
            for (int j = i + 1; j < n ; ++j) {
                diff = Math.abs(arr[i] - arr[j]);
                result = Math.min(result, diff);

                if (k == 2) {
                    key = set.ceiling(diff);

                    if (key != null)
                        result = Math.min(result, key - diff);

                    key = set.floor(diff);

                    if (key != null)
                        result = Math.min(result, diff - key);
                }
            }
        }
        System.out.println(result);
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