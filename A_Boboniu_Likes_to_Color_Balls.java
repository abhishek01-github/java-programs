import java.io.*;
import java.util.*;
public class A_Boboniu_Likes_to_Color_Balls {

    static IOHandler sc = new IOHandler();

    public static void main(String[] args) {

        int t = sc.nextInt();

        for (int i = 1; i <= t; ++i) {
            solve(i);
        }
    }

    private static void solve(int t) {
        int evens = 0;
        int odds = 0;
        int[] a = sc.readArray(4);

        for (int i = 0; i < 4; i++) {
            if(a[i]%2==0)
                evens++;
            else
                odds++;
        }

        if(evens==2){
            System.out.println("No");
            return;
        }
        if(odds==4 || evens==1){
            if(a[0]==0 || (a[1]==0 || a[2]==0))
                System.out.println("No");
            else
                System.out.println("Yes");
            return;
        }
        System.out.println("Yes");
        System.out.flush();
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
