import java.io.*;
import java.util.*;
public class B_Triangles_on_a_Rectangle {

    static IOHandler sc = new IOHandler();

    public static void main(String[] args) {

        int t = sc.nextInt();

        for (int i = 1; i <= t; ++i) {
            solve(i);
        }
    }

    private static void solve(int t) {
        long w = sc.nextLong();
        long h = sc.nextLong();

        int x1 = sc.nextInt();
        int a1[] = sc.readArray(x1);
        int x2 = sc.nextInt();
        int a2[] = sc.readArray(x2);
        int y1 = sc.nextInt();
        int b1[] = sc.readArray(y1);
        int y2 = sc.nextInt();
        int b2[] = sc.readArray(y2);

        long x = Math.max(h*(a1[x1-1]-a1[0]),h*(a2[x2-1]-a2[0]));
        long y = Math.max(w*(b1[y1-1]-b1[0]),w*(b2[y2-1]-b2[0]));
        System.out.println(Math.max(x,y));
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
