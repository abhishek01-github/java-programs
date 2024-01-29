import java.io.*;
import java.util.*;
public class E_Romantic_Glasses {

    static IOHandler sc = new IOHandler();

    public static void main(String[] args) {

        int t = sc.nextInt();

        for (int i = 1; i <= t; ++i) {
            solve(i);
        }
    }

    private static void solve(int t) {
        int n = sc.nextInt();
        long[] arr = new long[n];
        Set<Long> s = new HashSet<>();
        long sum = 0;

        for (int i = 0; i < n; i++) {
            if(i%2==0)
                arr[i] = sc.nextLong();
            else
                arr[i] = -sc.nextLong();
        }

        s.add(0L);
        for (int i = 0; i < n; i++) {
            sum += arr[i];
            if(s.contains(sum)){
                System.out.println("YES");
                return;
            }
            s.add(sum);
        }
        System.out.println("NO");
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
