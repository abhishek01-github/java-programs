import java.io.*;
import java.util.*;
public class B_YetnotherrokenKeoard {

    static IOHandler sc = new IOHandler();

    public static void main(String[] args) {

        int t = sc.nextInt();

        for (int i = 1; i <= t; ++i) {
            solve(i);
        }
    }

    private static void solve(int t) {
        char[] s = sc.next().trim().toCharArray();
        StringBuilder sb = new StringBuilder();
        ArrayList<Integer> small = new ArrayList<>();
        ArrayList<Integer> capital = new ArrayList<>();

        for (int i = 0; i < s.length; i++) {
            if((s[i]>='a' && s[i]<='z') && s[i]!='b'){
                small.add(i);
            }
            if((s[i]>='A' && s[i]<='Z') && s[i]!='B'){
                capital.add(i);
            }
            if(s[i]=='b'){
                if(!small.isEmpty()) {
                    s[small.get(small.size()-1)] = ' ';
                    small.remove(small.size()-1);
                }
            }
            if(s[i]=='B'){
                if(!capital.isEmpty()) {
                    s[capital.get(capital.size()-1)] = ' ';
                    capital.remove(capital.size()-1);
                }
            }
        }
        for (int i = 0; i < s.length; i++) {
            if(s[i]!=' ' && (s[i]!='b' && s[i]!='B')){
                sb.append(s[i]);
            }
        }
        System.out.println(sb);

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
