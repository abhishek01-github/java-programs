import java.io.*;
import java.util.*;
public class B_OR_in_Matrix {

    static IOHandler sc = new IOHandler();

    public static void main(String[] args) {

        int m = sc.nextInt();
        int n = sc.nextInt();
        int[][] arr = new int[m][n];
        int[][] a = new int[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        boolean flag = false;
        boolean ones = false;
        int count = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if(arr[i][j]==1){
                    count++;
                    ones = true;
                    a[i][j] = 1;
                    for (int k = 0; k < m; k++) {
                        if(arr[k][j]==0){
                            flag = true;
                            break;
                        }
                    }
                    for (int k = 0; k < n; k++) {
                        if(arr[i][k]==0){
                            if(flag){
                                System.out.println("NO");
                                return;
                            }
                            a[i][j] = 0;
                            count--;
                            break;
                        }
                    }
                    if(flag) {
                        a[i][j] = 0;
                        count--;
                    }
                }
                flag = false;
            }
        }
        if(count==0 && ones){
            System.out.println("NO");
            return;
        }
        System.out.println("YES");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
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
