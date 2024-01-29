import java.io.*;
import java.util.*;
public class E_Interview {

    static IOHandler sc = new IOHandler();

    public static void main(String[] args) {

        int t = sc.nextInt();

        for (int i = 1; i <= t; ++i) {
            solve(i);
        }
    }

    private static void solve(int t) {
        int n = sc.nextInt();
        int[] a = sc.readArray(n);
        int start = 0;
        int end = n-1;

        while(start<end){
            int mid = start + (end-start)/2;
            if(isSum(a,start,mid)) {
                end = mid;
            }else {
                start = mid+1;
            }
        }
        System.out.println("! " + (start+1));
        System.out.flush();
    }
    private static boolean isSum(int[] arr,int start, int end){
        StringBuilder sb = new StringBuilder();
        sb.append("? ").append(end-start+1);
        int sum = 0;

        for (int i = start; i <= end; i++) {
            sb.append(" ").append(i+1);
            sum += arr[i];
        }
        System.out.println(sb);
        System.out.flush();

        if(sc.nextLong()>sum)
            return true;
        else
            return false;
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
