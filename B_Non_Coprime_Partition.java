import java.io.*;
import java.util.*;
public class B_Non_Coprime_Partition {

    static IOHandler sc = new IOHandler();

    public static void main(String[] args) {

        solve(1);
    }

    private static void solve(int t) {
        int n = sc.nextInt();
        int even = 0;
        int odd = 0;
        StringBuilder x = new StringBuilder();
        StringBuilder y = new StringBuilder();
        int e = n/2;
        int o = (n%2==0) ? e : e+1;

        x.append(e).append(' ');
        y.append(o).append(' ');

        for (int i = 1; i <= n; i++) {
            if(i%2==0) {
                even += i;
                x.append(i).append(' ');
            }
            else {
                odd += i;
                y.append(i).append(' ');
            }
        }

        if(gcd(odd,even)==1)
            System.out.println("No");
        else{
            System.out.println("Yes");
            System.out.println(x);
            System.out.println(y);
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
