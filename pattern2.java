import java.*;
import java.util.Scanner;
public class pattern2 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int N = n*(n+1);
        for(int i=0;i<n;i++){
            int num = i==0 ? 1 : 
            for(int j=1;j<=2*n-i;j++){ 
                if(j<n-i){
                    System.out.print(num + " ");
                    num++
                }
            }
        }
    }
}
