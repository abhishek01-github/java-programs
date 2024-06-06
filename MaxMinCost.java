import java.util.Arrays;
import java.util.Scanner;

public class MaxMinCost {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] happinessLevels = new int[n];
        
        for(int i=0; i<n; i++){
            happinessLevels[i] = sc.nextInt();
        }
        
        int[] sortedLevels = Arrays.copyOf(happinessLevels, n);
        Arrays.sort(sortedLevels);
        
        int maxCost = sortedLevels[n - 1] - sortedLevels[0];
        
        int minCost = sortedLevels[1] - sortedLevels[0];
        for (int i = 1; i < n - 1; i++) {
            minCost += (sortedLevels[i + 1] - sortedLevels[i]);
        }
        int i=1, j=n;
        while(i<--j){
            maxCost += (sortedLevels[j] - sortedLevels[i]);
            if(++i < j) maxCost += (sortedLevels[j] - sortedLevels[i]);
        }
        
        System.out.println(minCost + " " + maxCost);
    }
}
