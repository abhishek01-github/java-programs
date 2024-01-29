import java.io.*;
import java.util.*;
public class B_Collecting_Game {

    static IOHandler sc = new IOHandler();

    public static void main(String[] args) {

        int t = sc.nextInt();

        for (int i = 1; i <= t; ++i) {
            solve(i);
        }
    }

    private static void solve(int t) {
        int n = sc.nextInt();
        int[] a = sc.readArray(n);
        int[] s = new int[n];
        for (int i = 0; i < n; i++) {
            s[i] = a[i];
        }
        Arrays.sort(s);
        List<Long> pre = new ArrayList<>();
        pre.add((long)s[0]);

        for (int i = 1; i < n; i++) {
            pre.add(pre.get(i-1)+ s[i]);
        }
        pre.set(n-1,(long)n-1);
        for (int i = n-2; i >=0 ; i--) {
            if(pre.get(i)>=s[i+1])
                pre.set(i,pre.get(i+1));
            else
                pre.set(i,(long)i);
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            sb.append(pre.get(Arrays.binarySearch(s,a[i]))).append(" ");
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
