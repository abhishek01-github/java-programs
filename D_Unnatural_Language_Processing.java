import java.io.*;
import java.util.*;
public class D_Unnatural_Language_Processing {

    static IOHandler sc = new IOHandler();

    public static void main(String[] args) {

        int t = sc.nextInt();

        for (int i = 1; i <= t; ++i) {
            solve(i);
        }
    }

    private static void solve(int t) {
        int n = sc.nextInt();
        String s = sc.next().trim();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < n; i++) {
            if(i==n-1 || i==0){
                sb.append(s.charAt(i));
                continue;
            }
            if(s.charAt(i)=='b' || s.charAt(i)=='c'  || s.charAt(i)=='d'){
                if((s.charAt(i+1)=='b' || (s.charAt(i+1)=='c'  || s.charAt(i+1)=='d')) && (s.charAt(i-1)=='a'  || s.charAt(i-1)=='e')) {
                    sb.append(s.charAt(i));
                    sb.append('.');
                }
                else if((s.charAt(i+1)=='a'  || s.charAt(i+1)=='e') && (s.charAt(i-1)=='a'  || s.charAt(i-1)=='e')){
                    sb.append('.');
                    sb.append(s.charAt(i));
                } else {
                    sb.append(s.charAt(i));
                }
            } else{
                sb.append(s.charAt(i));
            }
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