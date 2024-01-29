import java.io.*;
import java.util.*;
public class SegmentTree {

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
        int[] a = sc.readArray(n);
        int[] seg = new int[n*4];

        build(0,0,n-1,seg,a);

        int q = sc.nextInt();
        while(q-->0){
            int l = sc.nextInt();
            int r = sc.nextInt();

            System.out.println(query(0,0,n-1,l,r,seg));
        }
    }

    static void build(int index,int low,int high,int[] seg,int[] a){
        if(low==high){
            seg[index] = a[low];
            return;
        }
        int mid = low + (high-low)/2;
        build(2*index+1,low,mid,seg,a);
        build(2*index+2,mid+1,high,seg,a);

        seg[index] = Math.max(seg[2*index+1],seg[2*index+2]);
    }

    static int query(int index,int low,int high, int l,int r,int[] seg){
        if(low>=l && high<=r){
            return seg[index];
        }
        if(low>r || high<l){
            return Integer.MIN_VALUE;
        }
        int mid = low + (high-low)/2;
        int left = query(2*index+1,low,mid,l,r,seg);
        int right = query(2*index+2,mid+1,high,l,r,seg);

        return Math.max(left,right);
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
        for (int i = 0; i < n; i++) {
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

    // Function to sort a 2D array by the first column
    void sort2DArrayByFirstColumn(int[][] arr) {
        Arrays.sort(arr, (a, b) -> Integer.compare(a[0], b[0]));
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