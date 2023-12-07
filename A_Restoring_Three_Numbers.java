import java.io.*;
import java.util.*;
public class A_Restoring_Three_Numbers {

    static IOHandler sc = new IOHandler();

    public static void main(String[] args) {

        solve();
    }

    private static void solve() {
        int[] a = sc.readArray(4);
        int max = Math.max(Math.max(a[0],a[1]),Math.max(a[2],a[3]));

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < a.length; i++) {
            if(max-a[i]>0)
                sb.append(max-a[i]).append(" ");
        }
        System.out.println(sb);
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
