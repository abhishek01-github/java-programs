import java.io.*;
import java.util.*;
public class B_Number_Circle {

    static IOHandler sc = new IOHandler();

    public static void main(String[] args) {

        solve(1);
    }

    private static void solve(int t) {
        int n = sc.nextInt();
        int[] a = sc.readArray(n);

        Arrays.sort(a);
        int[] b = new int[n];

        if(a[n-1]>=a[n-2]+a[n-3]){
            System.out.println("NO");
            return;
        }
        int index = 0;
        for (int i = 0; i < n; i++) {
            if(i%2==0)
                b[index] = a[i];
            else{
                b[n-index-1] = a[i];
                index++;
            }
        }
        System.out.println("YES");
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < n; i++) {
            sb.append(b[i]).append(' ');
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
