import java.io.*;
import java.util.*;
public class C_Game_with_Multiset {

    static IOHandler sc = new IOHandler();

    public static void main(String[] args) {

        solve(1);

    }

    private static void solve(int x) {
        int m = sc.nextInt();
        int[] a = new int[30];
        while(m-->0){
            int t = sc.nextInt();
            int v = sc.nextInt();
            if(t==1){
                a[v]++;
            } else {
                int n = (int)(Math.log10(v)/Math.log10(2))/+1;
                for(int i=n;i>=0;i--){
                    int temp = Math.min(v>>i,a[i]);
                    v -= temp<<i;
                    if(v==0){
                        break;
                    }
                }
                if(v!=0)
                    System.out.println("NO");
                else
                    System.out.println("YES");
            }
        }
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