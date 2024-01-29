import java.io.*;
import java.util.*;
public class Yet_Another_Array_Game {

    static IOHandler sc = new IOHandler();

    public static void main(String[] args) {

        int t = sc.nextInt();
        int s = sc.nextInt();

        for (int i = 1; i <= t; ++i) {
            solve(i,s);
        }
    }

    private static void solve(int t,int s) {
        int n = sc.nextInt();
        long[] a = new long[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextLong();
        }
        Arrays.sort(a);
        long sum = 0;

        if(s==0){
            for (int i = 0; i <= n/2; i++) {
                sum += a[i];
            }
            if(n%2==0)
                sum-=a[0];
        } else {
            for (int i = 1; i < n; i++) {
                a[i] += a[i-1];
            }
            for (int i = 0; i < n; i++) {
                long temp = a[i+(n-1-i)/2];
                if(i>0)
                    temp -= a[i-1];
                if(temp>sum)
                    sum= temp;
            }
        }
        System.out.println(sum);
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
