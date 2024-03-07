import java.io.*;
import java.util.*;
public class C_Find_B {

    static FastIO sc = new FastIO();

    public static void main(String[] args) {
        int t = sc.nextInt();

        for (int i = 1; i <= t; ++i) {
            solve(i);
        }
        sc.close();
    }

    private static void solve(int t) {
        // time constraint and nextLong()
        int n = sc.nextInt();
        int q = sc.nextInt();
        long[] a = new long[n+1];
        long[] ones = new long[n+1];

        for (int i = 1; i <= n; i++) {
            a[i] = sc.nextLong();
            ones[i] = (a[i]==1) ? 1 : 0;
        }
        for (int i = 1; i <= n; i++) {
            a[i] = a[i]+a[i-1];
            ones[i] = ones[i] + ones[i-1];
        }

        while(q-->0){
            int l = sc.nextInt();
            int r = sc.nextInt();
            if(r==l){
                System.out.println("NO");
                continue;
            }
            long rem = a[r]-a[l-1]-(ones[r]-ones[l-1]);
            if (r-l+1<=rem){
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}

class FastIO {
    BufferedReader br;
    StringTokenizer st;

    public FastIO() {
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

    long nextLong() {
        return Long.parseLong(next());
    }

    double nextDouble() {
        return Double.parseDouble(next());
    }

    String nextLine() {
        String str = "";
        try {
            str = br.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return str;
    }

    int[] readArray(int n) {
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = nextInt();
        }
        return arr;
    }

    long[] readLongArray(int n) {
        long[] arr = new long[n];
        for (int i = 1; i < n; i++) {
            arr[i] = nextLong();
        }
        return arr;
    }

    double[] readDoubleArray(int n) {
        double[] arr = new double[n];
        for (int i = 0; i < n; i++) {
            arr[i] = nextDouble();
        }
        return arr;
    }

    // Function to reverse an array
    void reverseArray(int[] arr) {
        int start = 0, end = arr.length - 1;
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    // Function to find the maximum element in an array
    int getMaxElement(int[] arr) {
        int max = Integer.MIN_VALUE;
        for (int num : arr) {
            max = Math.max(max, num);
        }
        return max;
    }

    // Function to find the minimum element in an array
    int getMinElement(int[] arr) {
        int min = Integer.MAX_VALUE;
        for (int num : arr) {
            min = Math.min(min, num);
        }
        return min;
    }

    boolean isSpaceChar(int c) {
        return !(c >= 33 && c <= 126);
    }

    int[][] next2DInt(int n, int m) {
        int[][] arr = new int[n][];
        for (int i = 0; i < n; i++) {
            arr[i] = readArray(m);
        }
        return arr;
    }

    long[][] next2DLong(int n, int m) {
        long[][] arr = new long[n][];
        for (int i = 0; i < n; i++) {
            arr[i] = readLongArray(m);
        }
        return arr;
    }



    static long add(long a, long b) {
        return (a + b) % MOD;
    }

    static long subtract(long a, long b) {
        return (a - b + MOD) % MOD;
    }

    static long multiply(long a, long b) {
        return (a * b) % MOD;
    }

    static long power(long x, long y) {
        long res = 1;
        while (y > 0) {
            if (y % 2 != 0) {
                res = multiply(res, x);
            }
            x = multiply(x, x);
            y >>= 1;
        }
        return res;
    }

    static long computeModularInverse(long x, int m) {
        return power(x, m);
    }

    Random random = new Random();

    void close() {
        try {
            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    private static final int MOD = 1_000_000_007;
}