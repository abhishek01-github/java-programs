import java.io.*;
import java.util.*;
public class D_Product_of_Binary_Decimals {

    static FastIO sc = new FastIO();

    public static void main(String[] args) {
        int t = sc.nextInt();

        int[] a = {1, 10, 11, 100, 101, 110, 111, 1000, 1001, 1010, 1011, 1100, 1101, 1110, 1111, 10000, 10001, 10010, 10011, 10100, 10101, 10110, 10111, 11000, 11001, 11010, 11011, 11100, 11101, 11110, 11111, 100000, 100001, 100010, 100011, 100100, 100101, 100110, 100111, 101000, 101001, 101010, 101011, 101100, 101101, 101110, 101111, 110000, 110001, 110010, 110011, 110100, 110101, 110110, 110111, 111000, 111001, 111010, 111011, 111100, 111101, 111110,111111,121,1210,1221,1331,10201,11121,11211,12100,12111,12210,12221,12321,13310,13431,14641};
        Set<Integer> set = new HashSet<>();
        for (int num : a) {
            set.add(num);
        }
        for (int i = 1; i <= t; ++i) {
            solve(i,set);
        }
        sc.close();
    }

    private static void solve(int t,Set<Integer> s) {
        // time constraint and nextLong()
        int n = sc.nextInt();

        if(s.contains(n)){
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
    static boolean isBinary(int a) {
        while (a > 0) {
            if (a % 10 != 0 && a % 10 != 1)
                return false;
            a /= 10;
        }
        return true;
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