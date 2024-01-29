import java.io.*;
import java.util.*;
public class A_PLUS_B_Remastered {

    static IOHandler sc = new IOHandler();

    public static void main(String[] args) {

        int t = sc.nextInt();

        for (int i = 1; i <= t; ++i) {
            solve(i);
        }
    }

    private static void solve(int t) {
        // time constraint and nextLong()
        int n = sc.nextInt();
        int[] a = sc.readArray(n);
        Integer b[] = new Integer[n];

        for (int i = 0; i < n; i++) {
            b[i] = sc.nextInt();
        }

        Arrays.sort(a);
        Arrays.sort(b,Collections.reverseOrder());

        int num = a[0] + b[0];

        for (int i = 0; i < n; i++) {
            if(a[i]+b[i]!=num){
                System.out.println(-1);
                return;
            }
        }
        StringBuilder x = new StringBuilder();
        StringBuilder y = new StringBuilder();
        for (int i = 0; i < n; i++) {
            x.append(a[i]).append(' ');
            y.append(b[i]).append(' ');
        }
        System.out.println(x.toString());
        System.out.println(y.toString());
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
