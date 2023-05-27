import java.io.*;
import java.util.*;
public class B_Sort_the_Subarray {
    static IOHandler sc = new IOHandler();

    public static void main(String[] args) {

        int t = sc.nextInt();

        for (int i = 1; i <= t; ++i) {
            solve(i);
        }
    }

    private static void solve(int t) {
        int n = sc.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];
        int first=0;
        int second=0;
        int start1=0;
        int last1=0;
        int start2=0;
        int last2=0;
        boolean flag=false;

        for(int i=0;i<n;i++){
            a[i] = sc.nextInt();
        }
        for(int i=0;i<n;i++){
            b[i]=sc.nextInt();
            if(b[i]!=a[i] && flag==false) {
                first=i;
                second=i;
                flag=true;
            }
            if(flag==true) {
                if (b[i] >= b[i-1])
                    second = i;
                else
                    break;
            }
        }
        int max=0;
        int count=0;
        for(int i=1;i<n;i++){
            if(b[i]>=b[i-1]){
                count++;
                last2++;
            } else {
                if(max<count){
                    max=count;
                    start1=start2;
                    last1=last2;
                    count=0;
                }
                start2=i;
                count++;
            }
        }
        if(start1<=first && last1>=second){
            first=start1;
            second=last1;
        } else if(start1<=first && last1<=second)
            first=start1;
        else if(start1>=first && last1>=second)
            second=last1;
        System.out.println((first+1) + " " + (second+1));
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