import java.util.*;
public class C_Beautiful_Triple_Pairs {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }

            Map<Pair, Integer> mp1 = new HashMap<>();
            Map<Pair, Integer> mp2 = new HashMap<>();
            Map<Pair, Integer> mp3 = new HashMap<>();
            Map<Triple, Integer> gen = new HashMap<>();

            int ans = 0;

            for (int i = 0; i < n - 2; i++) {
                Triple key = new Triple(a[i], a[i + 1], a[i + 2]);
                int val = gen.getOrDefault(key, 0);

                ans += mp1.getOrDefault(new Pair(a[i], a[i + 1]), 0) - val;
                ans += mp2.getOrDefault(new Pair(a[i], a[i + 2]), 0) - val;
                ans += mp3.getOrDefault(new Pair(a[i + 1], a[i + 2]), 0) - val;

                mp1.put(new Pair(a[i], a[i + 1]), mp1.getOrDefault(new Pair(a[i], a[i + 1]), 0) + 1);
                mp2.put(new Pair(a[i], a[i + 2]), mp2.getOrDefault(new Pair(a[i], a[i + 2]), 0) + 1);
                mp3.put(new Pair(a[i + 1], a[i + 2]), mp3.getOrDefault(new Pair(a[i + 1], a[i + 2]), 0) + 1);
                gen.put(key, gen.getOrDefault(key, 0) + 1);
            }

            System.out.println(ans);
        }

        sc.close();
    }

    static class Pair {
        int first, second;

        Pair(int first, int second) {
            this.first = first;
            this.second = second;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            Pair pair = (Pair) o;

            if (first != pair.first) return false;
            return second == pair.second;
        }

        @Override
        public int hashCode() {
            int result = first;
            result = 31 * result + second;
            return result;
        }
    }

    static class Triple {
        int first, second, third;

        Triple(int first, int second, int third) {
            this.first = first;
            this.second = second;
            this.third = third;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            Triple triple = (Triple) o;

            if (first != triple.first) return false;
            if (second != triple.second) return false;
            return third == triple.third;
        }

        @Override
        public int hashCode() {
            int result = first;
            result = 31 * result + second;
            result = 31 * result + third;
            return result;
        }
    }
}