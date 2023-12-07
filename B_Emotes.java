import java.io.*;
import java.util.*;
public class B_Emotes {

    static IOHandler sc = new IOHandler();

    public static void main(String[] args) {

        solve(1);

    }

    private static void solve(int t) {
        int n = sc.nextInt();
        long m = sc.nextInt();
        long k = sc.nextInt();
        long ans = 0;

        int[] a = sc.readArray(n);
        Arrays.sort(a);
        long first = a[n-1];
        long second = a[n-2];

        ans = first*k*(m/(k+1))+second*(m/(k+1));
        System.out.println(ans+(first*(m%(k+1))));
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