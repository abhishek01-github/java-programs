import java.io.*;
import java.util.*;
public class B_Swap_and_Delete {

    static IOHandler sc = new IOHandler();

    public static void main(String[] args) {

        int t = sc.nextInt();

        for (int i = 1; i <= t; ++i) {
            solve(i);
        }
    }

    private static void solve(int t) {
        String s = sc.next().trim();
        int ones = 0;
        int zeroes = 0;

        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i)=='0')
                zeroes++;
            else
                ones++;
        }
        if(zeroes==ones) {
            System.out.println(0);
            return;
        }
        else if(zeroes==0 || ones==0) {
            System.out.println(Math.max(zeroes, ones));
            return;
        }
        else{
            for (int i = 0; i < s.length(); i++) {
                if(s.charAt(i)=='0') {
                    if(ones>0)
                        ones--;
                    else{
                        System.out.println(zeroes);
                        return;
                    }
                }
                else {
                    if(zeroes>0)
                        zeroes--;
                    else{
                        System.out.println(ones);
                        return;
                    }
                }
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
