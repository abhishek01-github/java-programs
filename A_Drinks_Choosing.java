import java.io.*;
import java.util.*;
public class A_Drinks_Choosing {

    static IOHandler sc = new IOHandler();

    public static void main(String[] args) {

        solve(1);

    }

    private static void solve(int t) {
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] a = new int[k];
        for (int i = 0; i < n; i++) {
            a[sc.nextInt()-1]++;
        }
        n = (n%2==0) ? n/2 : (n/2)+1;
        int ans = 0;
        for (int i = 0; i < k; i++) {
            if(n<=0)
                break;
            if(a[i]>1){
                n -= a[i]/2;
                ans += (a[i]/2)*2;
                a[i] %= 2;
            }
        }
        for (int i = 0; i < k; i++) {
            if(n<=0){
                System.out.println(ans);
                return;
            }
            if(a[i]==1){
                n--;
                ans++;
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