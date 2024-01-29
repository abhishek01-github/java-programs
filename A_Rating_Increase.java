import java.io.*;
import java.util.*;
public class A_Rating_Increase {

    static IOHandler sc = new IOHandler();

    public static void main(String[] args) {

        int t = sc.nextInt();

        for (int i = 1; i <= t; ++i) {
            solve(i);
        }
    }

    private static void solve(int t) {
        String s = sc.next().trim();
        int n = s.length()/2;
        int index = -1;

        for (int i = 0; i < n; i++) {
            if(s.charAt(i+1)!='0'){
                index = i;
                break;
            }
        }
        if(index==-1)
            System.out.println(index);
        else{
            int a = Integer.parseInt(s.substring(0,index+1));
            int b = Integer.parseInt(s.substring(index+1,s.length()));
            if(a>=b)
                System.out.println(-1);
            else
                System.out.println(a + " " + b);
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
