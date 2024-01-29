import java.io.*;
import java.util.*;
public class A_Young_Physicist {

    static IOHandler sc = new IOHandler();

    public static void main(String[] args) {

        solve(1);

    }

    private static void solve(int t) {
        int n = sc.nextInt();
        int x = 0;
        int y = 0;
        int z = 0;

        for (int i = 0; i < n; i++) {
            x += sc.nextInt();
            y += sc.nextInt();
            z += sc.nextInt();
        }
        if(x==0 && (y==0 && z==0))
            System.out.println("YES");
        else
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