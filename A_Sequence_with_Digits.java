import java.io.*;
import java.util.*;
public class A_Sequence_with_Digits {

    static IOHandler sc = new IOHandler();

    public static void main(String[] args) {

        int t = sc.nextInt();

        for (int i = 1; i <= t; ++i) {
            solve(i);
        }
    }

    private static void solve(int t) {
        long n = sc.nextLong();
        long k = sc.nextLong();

        for (int i = 2; i <= k; i++) {
            long min = find(n,0);
            long max = find(n,1);

            if(min==0)
                break;
            n += (min*max);
        }
        System.out.println(n);
    }

    static long find(long n,int digit){
        long min = 9;
        long max = 0;

        while(n!=0){
            if(n%10>max)
               max = n%10;
            if(n%10<min)
               min = n%10;
            n /= 10;
        }

        if(digit==0)
            return min;
        else
            return max;
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
