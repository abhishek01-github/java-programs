import java.util.*;
import java.io.*;

public class javaTemp {
  private static final int MOD = 1000000007;

  static class Pair {
    long key, value;

    public Pair(long k, long v) {
      this.key = k;
      this.value = v;
    }

  }

  static class DisjointSet {
    List<Integer> rank = new ArrayList<>();
    List<Integer> parent = new ArrayList<>();
    List<Integer> size = new ArrayList<>();

    public DisjointSet(int n) {
      for (int i = 0; i <= n; i++) {
        rank.add(0);
        parent.add(i);
        size.add(1);
      }
    }

    public int[] Z(char[] str) {
      int n = str.length;
      int[] z = new int[n];
      if (n == 0) return z;
      z[0] = n;
      int l = 0, r = 0;
      for (int i = 1; i < n; i++) {
        if (i > r) {
          l = r = i;
          while (r < n && str[r - l] == str[r]) r++;
          z[i] = r - l;
          r--;
        } else {
          if (z[i - l] < r - i + 1) {
            z[i] = z[i - l];
          } else {
            l = i;
            while (r < n && str[r - l] == str[r]) r++;
            z[i] = r - l;
            r--;
          }
        }
      }
      return z;
    }

    public int findUPar(int node) {
      if (node == parent.get(node)) {
        return node;
      }
      int ulp = findUPar(parent.get(node));
      parent.set(node, ulp);
      return parent.get(node);
    }

    public void unionByRank(int u, int v) {
      int ulp_u = findUPar(u);
      int ulp_v = findUPar(v);
      if (ulp_u == ulp_v)
        return;
      if (rank.get(ulp_u) < rank.get(ulp_v)) {
        parent.set(ulp_u, ulp_v);
      } else if (rank.get(ulp_v) < rank.get(ulp_u)) {
        parent.set(ulp_v, ulp_u);
      } else {
        parent.set(ulp_v, ulp_u);
        int rankU = rank.get(ulp_u);
        rank.set(ulp_u, rankU + 1);
      }
    }

    public void unionBySize(int u, int v) {
      int ulp_u = findUPar(u);
      int ulp_v = findUPar(v);
      if (ulp_u == ulp_v)
        return;
      if (size.get(ulp_u) < size.get(ulp_v)) {
        parent.set(ulp_u, ulp_v);
        size.set(ulp_v, size.get(ulp_v) + size.get(ulp_u));
      } else {
        parent.set(ulp_v, ulp_u);
        size.set(ulp_u, size.get(ulp_u) + size.get(ulp_v));
      }
    }
  }

  public static void main(String args[]) throws IOException {
    FastReader sc = new FastReader();
    PrintWriter pw = new PrintWriter(System.out);
    int testcase=sc.nextInt();
    for(int tc=1;tc<=testcase;tc++){
    // pw.print("Case #"+tc+": ");
      int n = sc.nextInt();
      int a[] = new int[n];
      for(int i=0;i<n;i++)
        a[i] =sc.nextInt();
      List<Integer> min = new ArrayList<>();
      int ans = n, val = (int)1e9;
      for(int i : a){
        val = Math.min(i, val);
        if(i == val)
          min.add(i);
      }
      Collections.reverse(min);
      for(int i=0;i<min.size();i++){
        ans = Math.min(ans, n - (i+1) + min.get(i));
      }
      pw.println(ans);
    }
  // System.out.flush();
    pw.close();

  }

  static boolean isPrime(int num) {
    // Check if the number is less than 2 (not a prime)
    if (num < 2) {
      return false;
    }

    // Check for divisibility by all numbers from 2 to the square root of num
    for (int i = 2; i * i <= num; i++) {
      if (num % i == 0) {
        // If the number is divisible by any i, it's not a prime
        return false;
      }
    }

    // If no divisors are found, the number is prime
    return true;
  }

  // static long modPow(long base, int exp) {
  // long ans = 1;
  // while(exp > 0) {
  // if((exp & 1) == 1) {
  // ans = (ans * base) % MOD;
  // }
  // base = (base * base) % MOD;
  // exp >>= 1;
  // }
  // return ans;
  // }
  // static void permute(String str, int l, int r)
  // {
  // if (l == r)
  // System.out.println(str);
  // else {
  // for (int i = l; i <= r; i++) {
  // str = swap(str, l, i);
  // permute(str, l + 1, r);
  // str = swap(str, l, i);
  // }
  // }
  // }
  public static void swap(char ans[], int i, int j) {
    char temp = ans[i];
    ans[i] = ans[j];
    ans[j] = temp;
  }

  static String swap(String a, int i, int j) {
    char temp;
    char[] charArray = a.toCharArray();
    temp = charArray[i];
    charArray[i] = charArray[j];
    charArray[j] = temp;
    return String.valueOf(charArray);
  }

  // static long myPow(long x, int pw)
  // {
  // long res = 1;
  // for(int i=0;i<pw;i++)
  // res=res*x;
  // return res;
  // }

  // static long lcm(long a, long b) {
  // return (a / gcd(a, b)) * b;
  // }

  static boolean subarraySum(int[] nums, int k) {
    int sum = 0;
    boolean result = false;
    Map<Integer, Integer> preSum = new HashMap<>();
    preSum.put(0, 1);

    for (int i = 0; i < nums.length; i++) {
      sum += nums[i];
      if (preSum.containsKey(sum - k)) {
        result = true;
        break;
      }
      preSum.put(sum, preSum.getOrDefault(sum, 0) + 1);
    }

    return result;
  }

  public static long nc2(long n) {
    if (n == 1) {
      return 0;
    }
    n *= (n - 1);
    n /= 2;
    return n;
  }

  static boolean valid(int i, int j, int n) {
    return i >= 0 && i < n && j >= 0 && j < n;
  }

  static int sumDigits(int no) {
    return no == 0 ? 0
        : no % 10 +
            sumDigits(no / 10);
  }

  static int digitCount(int x) {
    String n = "" + x;
    return n.length();
  }

  static long ncr(long n, long r, long p) {
    if (n < r)
      return 0;
    if (r == 0)
      return 1;
    long[] fac = new long[(int) n + 1];
    fac[0] = 1;
    for (int i = 1; i <= n; i++)
      fac[i] = (fac[i - 1] * i) % p;
    return (fac[(int) n] * modInverse(fac[(int) r], p) % p * modInverse(fac[(int) (n - r)], p) % p) % p;
  }

  static long modInverse(long n, long p) {
    return power(n, p - 2, p);
  }

  static long maxSubArraySum(int a[]) {
    int size = a.length;
    long max_so_far = Long.MIN_VALUE, max_ending_here = 0;

    for (int i = 0; i < size; i++) {
      max_ending_here = max_ending_here + a[i];
      if (max_so_far < max_ending_here)
        max_so_far = max_ending_here;
      if (max_ending_here < 0)
        max_ending_here = 0;
    }
    return max_so_far;
  }

  static long fact(long n) {

    // single line to find factorial
    return (n == 1 || n == 0) ? 1 : n * fact(n - 1);

  }

  static boolean isSorted(int a[]) {
    for (int i = 1; i < a.length; i++) {
      if (a[i] < a[i - 1])
        return false;
    }
    return true;
  }

  // static long gcd(long a, long b) {
  // if (a == 0)
  // return b;
  // return gcd(b % a, a);
  // }

  // static int lcm(int a, int b)
  // {
  // return (a / gcd(a, b)) * b;
  // }

  static int upper_bound(List<Integer> arr, int key, int i) {
    if (Collections.binarySearch(arr, key) >= 0)
      return Collections.binarySearch(arr, key);
    int mid, N = arr.size();

    // Initialise starting index and
    // ending index
    int low = i;
    int high = arr.size() - 1;

    // Till low is less than high
    while (low < high && low != N) {
      // Find the index of the middle element
      mid = low + (high - low) / 2;

      // If key is greater than or equal
      // to arr[mid], then find in
      // right subarray
      if (key >= arr.get(mid)) {
        low = mid + 1;
      }

      // If key is less than arr[mid]
      // then find in left subarray
      else {
        high = mid;
      }
    }

    return arr.get(low) > key ? low : -1;
  }

  static int lower_bound(List<Integer> arr, int key, int i) {
    // if(Arrays.binarySearch(arr, key) >= 0)
    // return Arrays.binarySearch(arr, key);
    // Initialize starting index and
    // ending index
    int low = 0, high = i;
    int mid;

    // Till high does not crosses low
    while (low < high) {

      // Find the index of the middle element
      mid = low + (high - low) / 2;

      // If key is less than or equal
      // to array[mid], then find in
      // left subarray
      if (key <= arr.get(mid)) {
        high = mid;
      }

      // If key is greater than array[mid],
      // then find in right subarray
      else {

        low = mid + 1;
      }
    }
    return low;
  }

  static boolean palin(int arr[], int i, int j) {
    while (i < j) {
      if (arr[i] != arr[j])
        return false;
      i++;
      j--;
    }
    return true;
  }

  static boolean palin(String s) {
    int i = 0, j = s.length() - 1;
    while (i < j) {
      if (s.charAt(i) != s.charAt(j))
        return false;
      i++;
      j--;
    }
    return true;
  }

  static long minSum(int arr[], int n, int k) {
    // k must be smaller than n
    if (n < k) {
      // System.out.println("Invalid");
      return -1;
    }

    // Compute sum of first window of size k
    long res = 0;
    for (int i = 0; i < k; i++)
      res += arr[i];

    // Compute sums of remaining windows by
    // removing first element of previous
    // window and adding last element of
    // current window.
    long curr_sum = res;
    for (int i = k; i < n; i++) {
      curr_sum += arr[i] - arr[i - k];
      res = Math.min(res, curr_sum);
    }

    return res;
  }

  static int nextIndex(int a[], int x) {
    int n = a.length;
    for (int i = x; i < n - 1; i++) {
      if (a[i] > a[i + 1]) {
        return i;
      }
    }
    return n;
  }

  static void rev(int a[], int i, int j) {
    while (i < j) {
      int t = a[i];
      a[i] = a[j];
      a[j] = t;
      i++;
      j--;
    }
  }

  static int sorted(int arr[], int n) {
    // Array has one or no element or the
    // rest are already checked and approved.
    if (n == 1 || n == 0)
      return 1;

    // Unsorted pair found (Equal values allowed)
    if (arr[n - 1] < arr[n - 2])
      return 0;

    // Last pair was sorted
    // Keep on checking
    return sorted(arr, n - 1);
  }

  static void sieveOfEratosthenes(int n, boolean prime[]) {
    // Create a boolean array "prime[0..n]" and
    // initialize all entries it as true. A value in
    // prime[i] will finally be false if i is Not a
    // prime, else true.
    Arrays.fill(prime, true);
    for (int p = 2; p * p <= n; p++) {
      // If prime[p] is not changed, then it is a
      // prime
      if (prime[p] == true) {
        // Update all multiples of p greater than or
        // equal to the square of it numbers which
        // are multiple of p and are less than p^2
        // are already been marked.
        for (int i = p * p; i <= n; i += p)
          prime[i] = false;
      }
    }
  }

  static boolean isPowerOfTwo(int n) {
    return (int) (Math.ceil((Math.log(n) / Math.log(2)))) == (int) (Math.floor(((Math.log(n) / Math.log(2)))));
  }

  static int countSetBits(long n) {
    int count = 0;
    while (n > 0) {
      count += n & 1;
      n >>= 1;
    }
    return count;
  }

  static int countBits(int number) {

    // log function in base 2
    // take only integer part
    return (int) (Math.log(number) /
        Math.log(2) + 1);
  }

  static long power(long x, long y, long p) {
    long res = 1; // Initialize result

    x = x % p; // Update x if it is more than or
    // equal to p

    if (x == 0)
      return 0; // In case x is divisible by p;

    while (y > 0) {

      // If y is odd, multiply x with result
      if ((y & 1) != 0)
        res = (res * x) % p;

      // y must be even now
      y = y >> 1; // y = y/2
      x = (x * x) % p;
    }
    return res;
  }

  static class FastReader {
    BufferedReader br;
    StringTokenizer st;

    public FastReader() {
      br = new BufferedReader(
          new InputStreamReader(System.in));
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
        if (st.hasMoreTokens()) {
          str = st.nextToken("\n");
        } else {
          str = br.readLine();
        }
      } catch (IOException e) {
        e.printStackTrace();
      }
      return str;
    }
  }
}