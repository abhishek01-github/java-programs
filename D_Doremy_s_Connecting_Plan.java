import java.io.*;
import java.util.*;
public class D_Doremy_s_Connecting_Plan {

    static IOHandler sc = new IOHandler();

    public static void main(String[] args) {

        int t = sc.nextInt();

        for (int i = 1; i <= t; ++i) {
            solve(i);
        }
    }

    private static void solve(int t) {
        int n = sc.nextInt();
        long c = sc.nextLong();
        long remain = 0;
        int index = 0;
        long sum = sc.nextLong();
        for (int i = 2; i <= n; i++) {
            long element = sc.nextLong();
                if(sum+element>=c*i) {
                    sum += element;
                    sum += remain;
                    remain=0;
                    index=0;
                }
                else{
                    remain+=element;
                    index=i;
                }
        }
        if(index!=0)
            System.out.println("NO");
        else
            System.out.println("YES");
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

        int [][] readGraph(int n, int m, int c) {
            int [][] graph = new int [n + 1][];

            int [] count = new int [n + 1];
            int [][] arr = new int [m][1 + c];

            int a, b;

            for (int i = 0; i < m; ++i) {
                a = sc.nextInt();
                b = sc.nextInt();

                arr[i][0] = a;
                arr[i][1] = b;

                ++count[a];
                ++count[b];

                for (int j = 2; j <= c; ++j) {
                    arr[i][j] = sc.nextInt();
                }
            }

            for (int i = 0; i <= n; ++i) {
                graph[i] = new int [count[i] * c];
                count[i] = 0;
            }
            int swap;

            for (int [] tArr : arr) {
                for (int j = 1; j < tArr.length; ++j) {
                    graph[tArr[0]][count[tArr[0]]++] = tArr[j];
                }

                swap = tArr[0];
                tArr[0] = tArr[1];
                tArr[1] = swap;

                for (int j = 1; j < tArr.length; ++j) {
                    graph[tArr[0]][count[tArr[0]]++] = tArr[j];
                }
            }

            return graph;
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
