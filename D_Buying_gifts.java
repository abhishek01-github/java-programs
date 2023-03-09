import java.util.*;
public class D_Buying_gifts {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        while(t>0){
            int n = input.nextInt();
            int[][] a = new int[n][2];
            int max1=0,max2=0;
            for(int i=0;i<n;i++){
                a[i][0]=input.nextInt();
                if(a[max1][0]<a[i][0])
                    max1=i;
                a[i][1]=input.nextInt();
                if(a[max2][1]<a[i][1])
                    max2=i;
            }
            int min=Math.abs(a[max1][0]-a[0][1]);
            for(int i=0;i<n;i++){
                if(max1!=i){
                    if(Math.abs(a[max1][0]-a[i][1])<min)
                        min=Math.abs(a[max1][0]-a[i][1]);
                }
                if(max2!=i){
                    if(Math.abs(a[max2][1]-a[i][0])<min)
                        min=Math.abs(a[max2][1]-a[i][0]);
                }
            }
            System.out.println(min);
            t--;
        }
    }
}