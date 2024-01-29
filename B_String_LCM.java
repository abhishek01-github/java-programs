import java.io.*;
import java.util.*;
public class B_String_LCM {

    static IOHandler sc = new IOHandler();

    public static void main(String[] args) {

        int t = sc.nextInt();

        for (int i = 1; i <= t; ++i) {
            solve(i);
        }
    }

    private static void solve(int t) {
        String a = sc.next().trim();
        String b = sc.next().trim();
        StringBuilder x = new StringBuilder();
        StringBuilder y = new StringBuilder();

        int l = a.length()*b.length()/gcd(a.length(),b.length());
        for (int i = 0; i < l/a.length(); i++) {
            x.append(a);
        }
        for (int i = 0; i < l/b.length(); i++) {
            y.append(b);
        }

        if(x.toString().equals(y.toString())){
            System.out.println(x);
        } else {
            System.out.println(-1);
        }
    }

    static int gcd(int a ,int b){
        if(a==0)
            return b;
        return gcd((b%a),a);
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
