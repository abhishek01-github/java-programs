import java.io.*;
import java.util.*;

public class D_Three_Activities {

    static IOHandler sc = new IOHandler();

    public static void main(String[] args) {
        int t = sc.nextInt();

        for (int i = 1; i <= t; ++i) {
            solve();
        }
    }

    private static void solve() {
        int n = sc.nextInt();

        int[] a = sc.readArray(n);
        int[] b = sc.readArray(n);
        int[] c = sc.readArray(n);

        Integer[] pa = new Integer[n];
        Integer[] pb = new Integer[n];
        Integer[] pc = new Integer[n];

        for (int i = 0; i < n; i++) {
            pa[i] = i;
            pb[i] = i;
            pc[i] = i;
        }

        Arrays.sort(pa, Comparator.comparingInt(i -> -a[i]));
        Arrays.sort(pb, Comparator.comparingInt(i -> -b[i]));
        Arrays.sort(pc, Comparator.comparingInt(i -> -c[i]));

        int ans = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                for (int k = 0; k < 3; k++) {
                    int x = pa[i], y = pb[j], z = pc[k];
                    if (x != y && y != z && x != z) {
                        ans = Math.max(ans, a[x] + b[y] + c[z]);
                    }
                }
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

        int [] readArray(int n) {
            int [] res = new int [n];

            for (int i = 0; i < n; ++i)
                res[i] = nextInt();

            return res;
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        long nextLong() {
            return Long.parseLong(next());
        }
    }
}
