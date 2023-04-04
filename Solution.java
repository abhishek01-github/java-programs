import java.util.* ;
import java.io.*;
public class Solution {
    Scanner input = new Scanner(System.in);
    int t=input.nextInt();
    while(t>0){
    public static int goodCells(int[][] v) {
            int n=input.nextInt();
            int m=input.nextInt();
            int[] row = new int[n];
            int[] col = new int[m];
            for (int i=0;i<n;i++) {
                int val = 0;
                for (int j = 0; j < m; j++) {
                    val ^= v[i][j];
                }
                row[i] = val;
            }
            for (int j=0;j<m;j++) {
                int val = 0;
                for (int i=0;i<n;i++) {
                    val ^= v[i][j];
                }
                col[j] = val;
            }
            int ans=0;
            for (int i=0;i<n;i++) {
                for (int j=0;j<m;j++) {
                    if (row[i] == col[j]) {
                        ans++;
                    }
                }
            }
            return ans;
        }
        t--;
    }

}
