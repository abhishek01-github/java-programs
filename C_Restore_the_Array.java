import java.util.*;
public class C_Restore_the_Array {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int t=input.nextInt();
        while(t>0){
            int n = input.nextInt();
            int[] a = new int[n-1];
            for(int i=0;i<n-1;i++){
                a[i]=input.nextInt();
            }
            for(int i=0;i<n;i++){
                if(i==0)
                    System.out.print(a[0] + " ");
                else if(i==n-1)
                    System.out.println(a[n-2]);
                else
                    System.out.print(Math.min(a[i-1],a[i]) + " ");
            }
            t--;
        }
    }
}